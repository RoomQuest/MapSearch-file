package edu.csusb.cse.roomquest;


/**
 * search result coord for coord on map
 */
public class SearchMap {
    Map map;
	public SearchMap(Map map) {
        this.map = map;
    }

	static class SearchResults {

		Result[] results;

		public Result getTopResult() {
			Result lowestResult = results[0];
			for (Result r : results) {
				if (r.matchStrength < lowestResult.matchStrength) {
					lowestResult = r;
				}
			}
			return lowestResult;
		}

		static class Result {
			Room room;
			int matchStrength;
		}

	}

	public void findRoom(String query) {
		for (Room r : map.rooms) {
			if(r.name == query) {

			}
			
		}
	}
}
		




		/*//search through file for match
		if (results = true)
		{
			maps.getname() = name;
		}
		else
		{
			//dialog
		}

        static class Result {
			//take in input from user
			*/





/*
			boolean results = false;
    		Scanner scan = new Scanner(new File("Maps")); //file location
    		String s;
    		int indexfound=-1;
    		String words[] = new String[100];
    		String word = JOptionPane.showInputDialog("Enter room number");

		    while (scan.hasNextLine()) 
   			{
    			s = scan.nextLine();
    			if(s.indexOf(word)>-1)
        			indexfound++; 

    		}
			if (indexfound>-1)
			{ 
    			results = true;
			}
			else 
			{
			    results = true;
			}
			return results;
        } */
    

//SearchMap sm = new SearchMap;
//SearchMap.SearchResults sr = SearchMap.SearchResults();
