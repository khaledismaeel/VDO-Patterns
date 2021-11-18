package rqcode.patterns.stigs.win10;

public abstract class LogonLogoffRequirement extends AuditPolicyRequirement {
    @Override
    protected String getCategory() {
        return "Logon/Logoff";
    }
}
