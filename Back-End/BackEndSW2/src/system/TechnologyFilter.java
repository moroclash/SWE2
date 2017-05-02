/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import freelaning.Task;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author moroclash
 */
public class TechnologyFilter implements Cariteria{    
	private HashSet<String> technologies; 

	/**
	 * 
	 * private iterator class
	 */
	
	private class BeIterator implements Iterator
	{

		@Override
		public Object next() {
			return null;
		}

		@Override
		public Object previous() {
			return null;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public int getSize() {
			return 1;
		}

		@Override
		public Object getIndx(int index) {
			return null;
		}

		@Override
		public Set getAll() {
			return null;
		}

		@Override
		public Set Clone() {
			return null;
		}

		@Override
		public boolean removeIndex(int Index) {
			return true;
		}
	}
	
	
	
	public HashSet<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(HashSet<String> technologies) {
		this.technologies = technologies;
	}
	
	public void TechnologyFilter(HashSet<String> technologies)
	{
	
	}
	
	
	@Override
	public Iterator GetFilter(List<Task> tasks) {
		return null;
	}
}
