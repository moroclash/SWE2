/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author moroclash
 */
public interface GetConstrains {

	public int getFr_timeoutPenalty();

	public int getFr_cancelingTaskPenalty();

	public int getFr_overtimePenalty();

	public int getEm_rejectFinishedTaskPenalty();

	public int getEm_cancelRunningTaskPenalty();

	public int getEm_cancelRunningTaskBudgetPenalty();

	public int getEm_rejectFinishedTaskBudgetPenalty();

	public int getOurProfit();

}
