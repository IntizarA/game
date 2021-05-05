package game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" added");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
	
		System.out.println(campaign.getCampaignName()+" deleted");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" updated");
		
	}




}
