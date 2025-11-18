// FILE: util/Auditable.java
package util;

/**
 * Interface for audit trail functionality
 * Demonstrates multiple inheritance when combined with other interfaces
 */
public interface Auditable {
    /**
     * Records an audit entry
     * @param action The action performed
     * @param timestamp When the action occurred
     */
    void recordAudit(String action, long timestamp);
    
    /**
     * Gets all audit entries
     * @return Array of audit entries
     */
    String[] getAuditTrail();
}