package system;

// @TahaMagdy: DONE
// Singletone Pattern
/**
 *
 */
public class Constraints {

	/**
	 *
	 */
	private int fr_timeoutPenalty;

	public int getFr_timeoutPenalty() {
		return fr_timeoutPenalty;
	}

	public void setFr_timeoutPenalty(int fr_timeoutPenalty) {
		this.fr_timeoutPenalty = fr_timeoutPenalty;
	}

	public int getFr_cancelingTaskPenalty() {
		return fr_cancelingTaskPenalty;
	}

	public void setFr_cancelingTaskPenalty(int fr_cancelingTaskPenalty) {
		this.fr_cancelingTaskPenalty = fr_cancelingTaskPenalty;
	}

	public int getFr_overtimePenalty() {
		return fr_overtimePenalty;
	}

	public void setFr_overtimePenalty(int fr_overtimePenalty) {
		this.fr_overtimePenalty = fr_overtimePenalty;
	}

	public int getEm_rejectFinishedTaskPenalty() {
		return em_rejectFinishedTaskPenalty;
	}

	public void setEm_rejectFinishedTaskPenalty(int em_rejectFinishedTaskPenalty) {
		this.em_rejectFinishedTaskPenalty = em_rejectFinishedTaskPenalty;
	}

	public int getEm_cancelRunningTaskPenalty() {
		return em_cancelRunningTaskPenalty;
	}

	public void setEm_cancelRunningTaskPenalty(int em_cancelRunningTaskPenalty) {
		this.em_cancelRunningTaskPenalty = em_cancelRunningTaskPenalty;
	}

	public int getEm_cancelRunningTaskBudgetPenalty() {
		return em_cancelRunningTaskBudgetPenalty;
	}

	public void setEm_cancelRunningTaskBudgetPenalty(int em_cancelRunningTaskBudgetPenalty) {
		this.em_cancelRunningTaskBudgetPenalty = em_cancelRunningTaskBudgetPenalty;
	}

	public int getEm_rejectFinishedTaskBudgetPenalty() {
		return em_rejectFinishedTaskBudgetPenalty;
	}

	public void setEm_rejectFinishedTaskBudgetPenalty(int em_rejectFinishedTaskBudgetPenalty) {
		this.em_rejectFinishedTaskBudgetPenalty = em_rejectFinishedTaskBudgetPenalty;
	}

	public int getOurProfit() {
		return ourProfit;
	}

	public void setOurProfit(int ourProfit) {
		this.ourProfit = ourProfit;
	}

	/**
	 *
	 */
	private int fr_cancelingTaskPenalty;

	/**
	 *
	 */
	private int fr_overtimePenalty;

	/**
	 *
	 */
	private int em_rejectFinishedTaskPenalty;

	/**
	 *
	 */
	private int em_cancelRunningTaskPenalty;

	/**
	 *
	 */
	private int em_cancelRunningTaskBudgetPenalty;

	public static Constraints getConstrain() {
		return constrain;
	}

	public static void setConstrain(Constraints constrain) {
		Constraints.constrain = constrain;
	}

	/**
	 *
	 */
	private int em_rejectFinishedTaskBudgetPenalty;

	/**
	 *
	 */
	private int ourProfit;

	/**
	 *
	 */
	static private Constraints constrain;

	/**
	 *
	 */
	private void Constraints() {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Constraints GetInstance() {
		// TODO implement here
		return null;
	}

}
