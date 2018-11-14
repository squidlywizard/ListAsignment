package choice.model;

import java.util.*;

public class corpseInfo
{
private Boolean edible = true;
private int howManyCorpses = 1;
private String species = "dog";
private ArrayList<String> specs ;

public corpseInfo (Boolean eat, int corpseCount, String species ) {
	this.edible = eat;
	this.howManyCorpses = corpseCount;
	this.species = species;
}
public String speciesEdibility(String Species) {
	
	return Species;
	
}

}
