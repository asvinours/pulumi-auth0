// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.CustomDomainVerificationArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.CustomDomainVerificationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * With Auth0, you can use a custom domain to maintain a consistent user experience. This is a three-step process; you must configure the custom domain in Auth0, then create a DNS record for the domain, then verify the DNS record in Auth0. This resource allows for automating the verification part of the process.
 * 
 * ## Import
 * 
 * You can import this resource using the custom domain ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/customDomainVerification:CustomDomainVerification my_custom_domain_verification &#34;cd_XXXXXXXXXXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/customDomainVerification:CustomDomainVerification")
public class CustomDomainVerification extends com.pulumi.resources.CustomResource {
    /**
     * The value of the `cname-api-key` header to send when forwarding requests. Only present if the type of the custom domain
     * is `self_managed_certs` and Terraform originally managed the domain&#39;s verification.
     * 
     */
    @Export(name="cnameApiKey", refs={String.class}, tree="[0]")
    private Output<String> cnameApiKey;

    /**
     * @return The value of the `cname-api-key` header to send when forwarding requests. Only present if the type of the custom domain
     * is `self_managed_certs` and Terraform originally managed the domain&#39;s verification.
     * 
     */
    public Output<String> cnameApiKey() {
        return this.cnameApiKey;
    }
    /**
     * ID of the custom domain resource.
     * 
     */
    @Export(name="customDomainId", refs={String.class}, tree="[0]")
    private Output<String> customDomainId;

    /**
     * @return ID of the custom domain resource.
     * 
     */
    public Output<String> customDomainId() {
        return this.customDomainId;
    }
    /**
     * The DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    @Export(name="originDomainName", refs={String.class}, tree="[0]")
    private Output<String> originDomainName;

    /**
     * @return The DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    public Output<String> originDomainName() {
        return this.originDomainName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDomainVerification(String name) {
        this(name, CustomDomainVerificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDomainVerification(String name, CustomDomainVerificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDomainVerification(String name, CustomDomainVerificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/customDomainVerification:CustomDomainVerification", name, args == null ? CustomDomainVerificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDomainVerification(String name, Output<String> id, @Nullable CustomDomainVerificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/customDomainVerification:CustomDomainVerification", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "cnameApiKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CustomDomainVerification get(String name, Output<String> id, @Nullable CustomDomainVerificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDomainVerification(name, id, state, options);
    }
}
