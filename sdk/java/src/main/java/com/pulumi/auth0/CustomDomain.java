// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.CustomDomainArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.CustomDomainState;
import com.pulumi.auth0.outputs.CustomDomainVerification;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With Auth0, you can use a custom domain to maintain a consistent user experience. This resource allows you to create and manage a custom domain within your Auth0 tenant.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.CustomDomain;
 * import com.pulumi.auth0.CustomDomainArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myCustomDomain = new CustomDomain(&#34;myCustomDomain&#34;, CustomDomainArgs.builder()        
 *             .domain(&#34;auth.example.com&#34;)
 *             .type(&#34;auth0_managed_certs&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Custom domains can be imported using their ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/customDomain:CustomDomain my_custom_domain cd_XXXXXXXXXXXXXXXX
 * ```
 * 
 */
@ResourceType(type="auth0:index/customDomain:CustomDomain")
public class CustomDomain extends com.pulumi.resources.CustomResource {
    /**
     * The HTTP header to fetch the client&#39;s IP address. Cannot be set on auth0_managed domains.
     * 
     */
    @Export(name="customClientIpHeader", type=String.class, parameters={})
    private Output</* @Nullable */ String> customClientIpHeader;

    /**
     * @return The HTTP header to fetch the client&#39;s IP address. Cannot be set on auth0_managed domains.
     * 
     */
    public Output<Optional<String>> customClientIpHeader() {
        return Codegen.optional(this.customClientIpHeader);
    }
    /**
     * Name of the custom domain.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Name of the custom domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    @Export(name="originDomainName", type=String.class, parameters={})
    private Output<String> originDomainName;

    /**
     * @return Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     * 
     */
    public Output<String> originDomainName() {
        return this.originDomainName;
    }
    /**
     * Indicates whether this is a primary domain.
     * 
     */
    @Export(name="primary", type=Boolean.class, parameters={})
    private Output<Boolean> primary;

    /**
     * @return Indicates whether this is a primary domain.
     * 
     */
    public Output<Boolean> primary() {
        return this.primary;
    }
    /**
     * Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
     * 
     */
    @Export(name="tlsPolicy", type=String.class, parameters={})
    private Output<String> tlsPolicy;

    /**
     * @return TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
     * 
     */
    public Output<String> tlsPolicy() {
        return this.tlsPolicy;
    }
    /**
     * Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Configuration settings for verification.
     * 
     */
    @Export(name="verifications", type=List.class, parameters={CustomDomainVerification.class})
    private Output<List<CustomDomainVerification>> verifications;

    /**
     * @return Configuration settings for verification.
     * 
     */
    public Output<List<CustomDomainVerification>> verifications() {
        return this.verifications;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDomain(String name) {
        this(name, CustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDomain(String name, CustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDomain(String name, CustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/customDomain:CustomDomain", name, args == null ? CustomDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDomain(String name, Output<String> id, @Nullable CustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/customDomain:CustomDomain", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CustomDomain get(String name, Output<String> id, @Nullable CustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDomain(name, id, state, options);
    }
}
