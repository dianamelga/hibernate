package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.SocialMedia;
import com.platzi.hibernate.model.Teacher;

public interface SocialMediaDao {

	void saveSocialMedia(SocialMedia socialMedia);
	
	void deleteSocialMediaById(Long idSocialMedia);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	List<SocialMedia> findAllSocialMedias();
	
}
