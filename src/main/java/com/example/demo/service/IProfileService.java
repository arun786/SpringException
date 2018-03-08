/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Profile;

/**
 * @author Adwiti
 *
 */
public interface IProfileService {

	public List<Profile> getPersonProfile();

	public List<Profile> getPersonProfile(String profileId);

}
