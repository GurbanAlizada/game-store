package Entities;

import java.time.LocalDate;

public class Campaign {

    private int campaignId;
    private String campaignName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int discount;

    public Campaign(int campaignId, String campaignName, LocalDate startDate,
                    LocalDate endDate, int discount) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }

    public Campaign() {
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


}
