
import java.security.acl.*;
import org.apache.http.conn.util.*;class Bicycle
{ 

//Data Member

private String ownerName;
private String tagNo; 
//Constructor Initialize the Date Members

public Bicycle(){
	
    ownerName = "unknown";
	tagNo = "unknown";	
}
public Bicycle( String ownerName, double startingtagNo){
	 
	this.ownerName = ownerName;
	this.tagNo = tagNo;
	}
	

//Returns the name of the Bicycle's owner

public String getownerName(){
	
	 return ownerName;
} 
public void getownerName(String ownerName){
	
	this.ownerName = ownerName; 
	} 
public String setownerName(){

	return ownerName;
		}

public String gettagNo(){
	 
	 return tagNo;
}
 //Assign the name of the Bicycle owner

 
public void setOwnerName(String name){
	
	 ownerName = name;
	 }
	 
public void settagNo(String name){
	 
	tagNo = name;
	}
	
}
