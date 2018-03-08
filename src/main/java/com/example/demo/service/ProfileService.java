/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Profile;
import com.example.demo.dao.IProfileDAO;
import com.example.demo.exception.PersonNotFoundException;

/**
 * @author Adwiti
 *
 */
@Service
public class ProfileService implements IProfileService {

	@Autowired
	IProfileDAO iprofileDao;

	@Override
	public List<Profile> getPersonProfile() {
		return iprofileDao.getPersonProfile();
	}

	@Override
	public List<Profile> getPersonProfile(String profileId) {
		if (profileId.equals("123")) {
			throw new PersonNotFoundException("Profile Not Found");
		}
		return iprofileDao.getPersonProfile(profileId);
	}

}
