/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Profile;
import com.example.demo.service.IProfileService;

/**
 * @author Adwiti
 *
 */
@RestController
public class ProfilesController {

	@Autowired
	IProfileService iProfileService;

	@GetMapping("/person/v1/profiles")
	public ResponseEntity<List<Profile>> getPersonProfile() {
		List<Profile> profiles = iProfileService.getPersonProfile();
		return new ResponseEntity<>(profiles, HttpStatus.OK);
	}

	@GetMapping("/person/v1/profiles/{profileId}")
	public ResponseEntity<List<Profile>> getPersonProfile(@PathVariable String profileId) {
		List<Profile> profiles = iProfileService.getPersonProfile(profileId);
		return new ResponseEntity<>(profiles, HttpStatus.OK);
	}

}
