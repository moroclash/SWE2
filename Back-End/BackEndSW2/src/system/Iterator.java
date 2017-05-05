// #Done @moroclash
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.util.List;
import java.util.Set;

/**
 *
 * @author moroclash
 */
public interface Iterator {
	
	public Object next();
	public Object previous();
	public boolean hasNext();
	public int getSize();
	public Object getIndx(int index);
	public List getAll();
	public List Clone();
	public boolean removeIndex(int Index);
}