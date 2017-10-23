#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.type;

public enum LoadType {
	ONLINE("ONLINE"),
	FILE("");
	
	String type;
	
	private LoadType(String type){
		this.type=type;
		
	}
}
