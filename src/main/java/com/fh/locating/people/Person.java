package com.fh.locating.people;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Person {

	@Id
	private String id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Device> devices = new ArrayList<Device>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public String getDeviceByMac(String mac) {
		if (mac == null) {
			throw new IllegalArgumentException("Device name must not be null");
		}

		for (Device d : this.devices) {
			if (d.getMac().equals(mac)) {
				return d.getName();
			}
		}

		return null;
	}

}

class Device {
	private String name;
	private String mac;
	private Boolean enabled = Boolean.FALSE;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

}
