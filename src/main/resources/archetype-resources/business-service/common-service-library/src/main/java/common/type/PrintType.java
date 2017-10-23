#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common.type;

public enum PrintType {

	TXT("TXT"),
	PDF("PDF"),
	XML("XML");
	
	String type;
	
	private PrintType (String type){
		this.type=type;
	}
	
}
