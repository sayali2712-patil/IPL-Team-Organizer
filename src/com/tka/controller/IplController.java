package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.Service;

public class IplController {
	Service service=null;
	public List<Player> getAllPlayer() {
	
//		System.out.println("WE Are in Controller ->getAllPlayer");
		 service = new Service();
		 List<Player> allplayerlist= service.getAllPlayer();
		return allplayerlist;
		
	}
	public List<Player> getAllCSKPlayer() {
		service = new Service();
		 List<Player> allCSKplayerlist= service.getAllCskPlayer();
		return allCSKplayerlist;
	}
	public List<Player> getAllMIPlayer() {
		service = new Service();
		 List<Player> allMIplayerlist= service.getAllMIPlayer();
		return allMIplayerlist;
	}
	public List<Player> getAllRCBPlayer() {
		service = new Service();
		 List<Player> allRCBplayerlist= service.getAllRCBPlayer();
		return allRCBplayerlist;
	}
	

//	public List<Player> getAllCSKPlayer() {
//		service = new Service();
//		 List<Player> allCSKplayerlist= service.getAllCSKPlayer();
//		return allCSKplayerlist;
//	}

}
