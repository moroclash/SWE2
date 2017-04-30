/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import freelaning.Task;
import java.util.List;

/**
 *
 * @author moroclash
 */
public interface Cariteria {
	public Iterator GetFilter(List<Task> tasks);
}
