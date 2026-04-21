package model;

public class Report {

    private int reportId;
    private int userId;
    private String type;
    private String location;
    private String description;
    private String status;
    private String date;

    // Default Constructor
    public Report() {
    }

    // Parameterized Constructor
    public Report(int reportId, int userId, String type, String location, String description, String status, String date) {
        this.reportId = reportId;
        this.userId = userId;
        this.type = type;
        this.location = location;
        this.description = description;
        this.status = status;
        this.date = date;
    }

    // Getters and Setters
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}