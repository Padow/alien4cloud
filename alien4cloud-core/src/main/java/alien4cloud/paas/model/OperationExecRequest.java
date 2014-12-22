package alien4cloud.paas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Object defining a request to execute an operation on a node template, from topology deployed in a specific cloud.
 *
 * @author 'Igor Ngouagna'
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("PMD.UnusedPrivateField")
public class OperationExecRequest extends NodeOperationExecRequest {

    @NotBlank
    String topologyId;
    /** Id of the cloud on which to execute the command **/
    @NotBlank
    String cloudId;
}
