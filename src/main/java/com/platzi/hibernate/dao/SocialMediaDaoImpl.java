package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.SocialMedia;

public class SocialMediaDaoImpl implements SocialMediaDao {

	private PlatziSession platziSession;

	public SocialMediaDaoImpl() {
		platziSession = new PlatziSession();
	}

	public void saveSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSocialMediaById(Long idSocialMedia) {
		// TODO Auto-generated method stub
		
	}

	public void updateSocialMedia(SocialMedia socialMedia) {
		// TODO Auto-generated method stub
		
	}

	public List<SocialMedia> findAllSocialMedias() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
