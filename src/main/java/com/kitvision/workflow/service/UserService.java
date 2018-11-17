package com.kitvision.workflow.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kitvision.workflow.model.CustomUserDetails;
import com.kitvision.workflow.model.User;
import com.kitvision.workflow.repository.UserJpaRepository;
/**
 * 
 * @author mohamed
 *
 * This class handle how to access user data From DB.
 */
@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserJpaRepository userRep;
	
	/**
	 * @param the user name to look for.
	 * @exception UsernameNotFoundException if the user name dose not exist.
	 * 
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRep.findByUsername(username);
			
		return new CustomUserDetails(user.orElseThrow(
												() -> 
												new UsernameNotFoundException("Wrong username or password")
												));
		
		
	}

}
