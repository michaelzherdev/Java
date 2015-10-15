package org.mzherdev;

import java.security.Provider.Service;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

//http://www.webservicex.net/geoipservice.asmx?WSDL
// cmd: wsimport http://www.webservicex.net/geoipservice.asmx?WSDL
// cmd: wsimport -keep -s src http://www.webservicex.net/geoipservice.asmx?WSDL
//173.194.122.224 google.com
// 212.58.244.20 bbc.com

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("You need to pass in one IP addess");
		} else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIp.getCountryName());
		}
	}

}
