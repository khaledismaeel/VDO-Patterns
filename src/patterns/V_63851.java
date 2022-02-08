package patterns;

public class V_63851 extends UserAccountManagementRequirement {
    @Override
    protected String getFailure() {
        return null;
    }

    @Override
    protected String getInclusionSetting() {
        return "Success";
    }

    @Override
    protected String getSuccess() {
        return "enable";
    }

    @Override
    public String checkTextCode() {
        return "C-81367r1_chk";
    }

    @Override
    public String date() {
        return "2019-01-04";
    }

    @Override
    public String findingID() {
        return "V_63851";
    }

    @Override
    public String fixTextCode() {
        return "F-88439r1_fix";
    }

    @Override
    public String iAControls() {
        return "";
    }

    @Override
    public String ruleID() {
        return "SV-78341r2_rule";
    }

    @Override
    public String sTIG() {
        return "Windows 10 Security Technical Implementation Guide";
    }

    @Override
    public String severity() {
        return "Medium";
    }

    @Override
    public String version() {
        return "WN10-UR-000025";
    }
}

