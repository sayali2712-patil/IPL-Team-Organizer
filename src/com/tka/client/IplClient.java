package com.tka.client;

import java.util.List;

import com.tka.controller.IplController;
import com.tka.entity.Player;

public class IplClient {

	public static void main(String[] args) {
	IplController iplController = new IplController();
	List<Player> allplayerlist=iplController.getAllPlayer();
//	System.out.println("WE are back in client");
	System.out.println(allplayerlist);
	
	List<Player> allCSKplayerlist=iplController.getAllCSKPlayer();
	System.out.println("CSK Players are :");
	System.out.println(allCSKplayerlist);
	
	List<Player> allMIplayerlist=iplController.getAllMIPlayer();
	System.out.println("MI Players are :");
	System.out.println(allMIplayerlist);
	
	List<Player> allRCBplayerlist=iplController.getAllRCBPlayer();
	System.out.println("RCB Players are :");
	System.out.println(allRCBplayerlist);
	
	}
	}


