package com.kitvision.workflow.model;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
/**
 * 
 * @author mohamed
 *
 * This class implements the Spring UserDetails interface,
 * To manage the user object.
 */
public class CustomUserDetails implements UserDetails {

	
	private User user;
	
	public CustomUserDetails(User user){
		this.user = user;
	}
	/**
	 * this function convert the user {@code user.getRole()} To SimpleGrantedAuthority.
	 * So Spring could handle it.
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return user.getRoles()
				.stream()
				.map((role) -> new SimpleGrantedAuthority(role.getRole()))
				.collect(Collectors.toSet());
	}

	@Override
	public String getPassword() {
		return  user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	/**
	 * Default to return true, as the user password will not expired.
	 */
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * default to true, as the user will never be locked.
	 */
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * if the password Expired (( Forgotten only)).
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return !user.isExpired();
	}

	/**
	 * if the user is active.
	 */
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return user.isActive();
	}

}
