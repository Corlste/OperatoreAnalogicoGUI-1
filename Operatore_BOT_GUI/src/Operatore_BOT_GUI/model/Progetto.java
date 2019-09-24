package Operatore_BOT_GUI.model;

public class Progetto {

	private String partitaIVA;
	private String projectRCN;
	private String status;
	private String programme;
	private String title;
	private String startDate;
	private String endDate;
	private String objective;
	private double totalCost;
	private double ecContribution;
	private double ecContributionTotal;
	private String fundingScheme;
	private boolean coordinator;
	private String otherParticipants;
	
	
	public Progetto(String partitaIVA, String projectRCN, String status, String programme, String title,
			String startDate, String endDate, String objective, double totalCost, double ecContribution,
			double ecContributionTotal, String fundingScheme, boolean coordinator, String otherParticipants) {
		super();
		this.partitaIVA = partitaIVA;
		this.projectRCN = projectRCN;
		this.status = status;
		this.programme = programme;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.objective = objective;
		this.totalCost = totalCost;
		this.ecContribution = ecContribution;
		this.ecContributionTotal = ecContributionTotal;
		this.fundingScheme = fundingScheme;
		this.coordinator = coordinator;
		this.otherParticipants = otherParticipants;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Progetto " + title ;
	}




	public Progetto() {
		super();
	}
	public Progetto(String partitaIVA) {
		super();
		this.partitaIVA = partitaIVA;
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	public String getProjectRCN() {
		return projectRCN;
	}
	public void setProjectRCN(String projectRCN) {
		this.projectRCN = projectRCN;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getObjective() {
		return objective;
	}
	public void setObjective(String objective) {
		this.objective = objective;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public double getEcContribution() {
		return ecContribution;
	}
	public void setEcContribution(double ecContribution) {
		this.ecContribution = ecContribution;
	}
	public double getEcContributionTotal() {
		return ecContributionTotal;
	}
	public void setEcContributionTotal(double ecContributionTotal) {
		this.ecContributionTotal = ecContributionTotal;
	}
	public String getFundingScheme() {
		return fundingScheme;
	}
	public void setFundingScheme(String fundingScheme) {
		this.fundingScheme = fundingScheme;
	}
	public boolean isCoordinator() {
		return coordinator;
	}
	public void setCoordinator(boolean coordinator) {
		this.coordinator = coordinator;
	}
	public String getOtherParticipants() {
		return otherParticipants;
	}
	public void setOtherParticipants(String otherParticipants) {
		this.otherParticipants = otherParticipants;
	}
	
	
	
}
