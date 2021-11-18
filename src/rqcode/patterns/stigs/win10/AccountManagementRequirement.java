package rqcode.patterns.stigs.win10;

public abstract class AccountManagementRequirement extends AuditPolicyRequirement {
    @Override
    protected String getCategory() {
        return "Account Management";
    }
}
