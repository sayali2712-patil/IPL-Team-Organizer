package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class Dao<conn> {
	String path="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/batch1194db";
	String uname="root";
	String pwd="root";
	Connection conn =null;
	Statement st=null;

	ResultSet rs=null;
	String query="SELECT * FROM batch1194db.player ";
	List<Player>allplayerlist=null;

	public List<Player> getAllPlayers() {
		allplayerlist=new ArrayList<Player>();
		
//		System.out.println("We are in Dao ->getAllPlayer");
		
		try {
			Class.forName(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver Not Found");
		}
		try {
			conn=DriverManager.getConnection(url, pwd,uname);
			st=conn.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				int jn = rs.getInt("jn");
				String pnm = rs.getString("name");
				int runs = rs.getInt("runs");
				int wickets = rs.getInt("wickets");
				String tname = rs.getString("tname");
				
				Player p1=new Player(jn,pnm,runs,wickets,tname);
				allplayerlist.add(p1);
//				System.out.println(jn + pnm + runs +" "+wickets +tname);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allplayerlist;
	}

}
