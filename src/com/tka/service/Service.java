package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Player;

public class Service {
	Dao dao=null;
	public List<Player> getAllPlayer() {
		
//		System.out.println("WE Are in Service ->getAllPlayer");
		 dao = new Dao();
		 List<Player> allplayerlist= dao.getAllPlayers();

		return allplayerlist;
	}
	public List<Player> getAllCskPlayer() {
		 dao = new Dao();
		 List<Player> allplayerlist= dao.getAllPlayers();
		 List<Player> allCSKplayerlist= new ArrayList<Player>();
		 for (Player player :allplayerlist)
				{
					if(player.getTname().equals("CSK"))
					{
						allCSKplayerlist.add(player);
					}
				}
		 		return allCSKplayerlist;
	}
	public List<Player> getAllMIPlayer() {
		dao = new Dao();
		 List<Player> allplayerlist= dao.getAllPlayers();
		 List<Player> allMIplayerlist= new ArrayList<Player>();
		 for (Player player :allplayerlist)
				{
					if(player.getTname().equals("MI"))
					{
						allMIplayerlist.add(player);
					}
				}
		 		return allMIplayerlist;
	}
	public List<Player> getAllRCBPlayer() {
		dao = new Dao();
		 List<Player> allplayerlist= dao.getAllPlayers();
		 List<Player> allRCBplayerlist= new ArrayList<Player>();
		 for (Player player :allplayerlist)
				{
					if(player.getTname().equals("RCB"))
					{
						allRCBplayerlist.add(player);
					}
				}
		 		return allRCBplayerlist;
	}

	
	
}
