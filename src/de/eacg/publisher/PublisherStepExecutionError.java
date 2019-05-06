package de.eacg.ecs.publisher;

/**
 * Step execution error
 *
 * @author Varanytsia Anatolii
 * MIT, Apache-2.0, LGPL-2.0, EPL-1.2
 */
public class PublisherStepExecutionError extends Exception {
    /**
     * Constructor
     *
     * @param message message
     */
    public PublisherStepExecutionError(String message) {
        super(message);
    }
}
