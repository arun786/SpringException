/**
 * 
 */
package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Phone;
import com.example.demo.bean.Profile;

/**
 * @author Adwiti
 *
 */
@Repository
public class ProfileDAO implements IProfileDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String sql = "SELECT PRO.FIRSTNAME, PRO.LASTNAME, PRO.PREFIX, PH.AREA_CODE, PH.EXTENSION, PH.PHONE_NUMBER FROM PROFILE PRO, PHONE PH WHERE PH.PROFILE_ID = PRO.PROFILE_ID";
	private String sqlProfile = "SELECT PRO.FIRSTNAME, PRO.LASTNAME, PRO.PREFIX, PH.AREA_CODE, PH.EXTENSION, PH.PHONE_NUMBER FROM PROFILE PRO, PHONE PH WHERE PH.PROFILE_ID = PRO.PROFILE_ID and PRO.PROFILE_ID = ?";

	public List<Profile> getPersonProfile() {

		List<Profile> profiles = jdbcTemplate.query(sql, (rs, row) -> {
			Profile profile = new Profile();
			profile.setFirstName(rs.getString(1));
			profile.setLastName(rs.getString(2));
			profile.setPrefix(rs.getString(3));

			Phone phone = new Phone();
			phone.setAreaCode(rs.getString(4));
			phone.setExtension(rs.getString(5));
			phone.setPhoneNumber(rs.getString(6));
			profile.setPhone(Arrays.asList(phone));
			return profile;
		});
		return profiles;
	}

	@Override
	public List<Profile> getPersonProfile(String profileId) {

		List<Profile> profiles = jdbcTemplate.query(sqlProfile, new Object[] { profileId }, (rs, row) -> {
			Profile profile = new Profile();
			profile.setFirstName(rs.getString(1));
			profile.setLastName(rs.getString(2));
			profile.setPrefix(rs.getString(3));

			Phone phone = new Phone();
			phone.setAreaCode(rs.getString(4));
			phone.setExtension(rs.getString(5));
			phone.setPhoneNumber(rs.getString(6));
			profile.setPhone(Arrays.asList(phone));
			return profile;
		});
		return profiles;
	}

}
