package rgms.publication

import rgms.member.Member;

class ResearchLine {
    
    String name
    String description      
	     
    static hasMany = [publications : Publication, members: Member]
    
	static constraints = {
        name(blank:false, unique:true)
        description(maxSize:256,blank:false)        
    }
	 
    String toString() {
        return name;
    }
}