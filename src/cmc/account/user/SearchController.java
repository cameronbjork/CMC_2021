/**
 * 
 */
package cmc.account.user;

import java.util.ArrayList;
import java.util.List;

import cmc.university.University;

/**
 * @author cbjork001
 *
 */
public class SearchController {
	private DBController DBC;

	public ArrayList<University> searchUniversities(String string, String string2) {
		DBC.getUniversities(string,string2)
		return null;
		
	}
}
