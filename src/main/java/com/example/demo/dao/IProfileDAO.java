/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Profile;

/**
 * @author Adwiti
 *
 */
public interface IProfileDAO {
	public List<Profile> getPersonProfile();
	
	public List<Profile> getPersonProfile(String profileId);

}
