/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import freelaning.Skill;
import freelaning.Task;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author moroclash
 */
public class StateTaskFilter implements Cariteria{

	private int state;
	
	public StateTaskFilter(int state)
	{
		this.state=state;
	}

	/**
	 *
	 * private class that use to implement iterator to can display
	 * Collection
	 */
	private class BeIterator implements system.Iterator {

		private List lis;
		private java.util.ListIterator iterator;

		public BeIterator(List lis) {
			this.lis = lis;
			this.iterator = lis.listIterator();
		}

		@Override
		public Object next() {
			return this.iterator.next();
		}

		@Override
		public Object previous() {
			return this.iterator.previous();
		}

		@Override
		public boolean hasNext() {
			return this.iterator.hasNext();
		}

		@Override
		public int getSize() {
			return this.lis.size();
		}

		@Override
		public Object getIndx(int index) {
			return this.lis.get(index);
		}

		@Override
		public List getAll() {
			return this.lis;
		}

		@Override
		public List Clone() {
			return new ArrayList<>(this.lis);
		}

		@Override
		public boolean removeIndex(int Index) {
			try {
				this.lis.remove(Index);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}

	/**
	 * Done tested
	 * @moroclash
	 * 
	 * @param tasks : this tasks that will filtered
	 * @return  : return iterator that have tasks after filtered
	 */
	@Override
	public Iterator GetFilter(List<Task> tasks) {
		HashSet<Task> tas = new HashSet<>();
		tasks.forEach(teq->{
			if(teq.getState()==this.state)
				tas.add(teq);
		});
		return new BeIterator(new ArrayList(tas));
	}
	
	
}
