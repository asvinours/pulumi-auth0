// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ResourceServerArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ResourceServerState;
import com.pulumi.auth0.outputs.ResourceServerScope;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can set up APIs that can be consumed from your authorized applications.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.ResourceServer;
 * import com.pulumi.auth0.ResourceServerArgs;
 * import com.pulumi.auth0.inputs.ResourceServerScopeArgs;
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
 *         var myResourceServer = new ResourceServer(&#34;myResourceServer&#34;, ResourceServerArgs.builder()        
 *             .allowOfflineAccess(true)
 *             .identifier(&#34;https://api.example.com&#34;)
 *             .scopes(            
 *                 ResourceServerScopeArgs.builder()
 *                     .description(&#34;Create foos&#34;)
 *                     .value(&#34;create:foo&#34;)
 *                     .build(),
 *                 ResourceServerScopeArgs.builder()
 *                     .description(&#34;Create bars&#34;)
 *                     .value(&#34;create:bar&#34;)
 *                     .build())
 *             .signingAlg(&#34;RS256&#34;)
 *             .skipConsentForVerifiableFirstPartyClients(true)
 *             .tokenLifetime(8600)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Existing resource servers can be imported using their ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/resourceServer:ResourceServer my_resource_server XXXXXXXXXXXXXXXXXXXXXXX
 * ```
 * 
 */
@ResourceType(type="auth0:index/resourceServer:ResourceServer")
public class ResourceServer extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    @Export(name="allowOfflineAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowOfflineAccess;

    /**
     * @return Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    public Output<Optional<Boolean>> allowOfflineAccess() {
        return Codegen.optional(this.allowOfflineAccess);
    }
    /**
     * If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     * 
     */
    @Export(name="enforcePolicies", type=Boolean.class, parameters={})
    private Output<Boolean> enforcePolicies;

    /**
     * @return If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     * 
     */
    public Output<Boolean> enforcePolicies() {
        return this.enforcePolicies;
    }
    /**
     * Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of permissions (scopes) used by this resource server.
     * 
     * @deprecated
     * Managing scopes through the `scopes` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_resource_server_scope` or `auth0_resource_server_scopes` resources to manage role scopes instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info.
     * 
     */
    @Deprecated /* Managing scopes through the `scopes` attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_resource_server_scope` or `auth0_resource_server_scopes` resources to manage role scopes instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) for more info. */
    @Export(name="scopes", type=List.class, parameters={ResourceServerScope.class})
    private Output</* @Nullable */ List<ResourceServerScope>> scopes;

    /**
     * @return List of permissions (scopes) used by this resource server.
     * 
     */
    public Output<Optional<List<ResourceServerScope>>> scopes() {
        return Codegen.optional(this.scopes);
    }
    /**
     * Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    @Export(name="signingAlg", type=String.class, parameters={})
    private Output<String> signingAlg;

    /**
     * @return Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    public Output<String> signingAlg() {
        return this.signingAlg;
    }
    /**
     * Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    @Export(name="signingSecret", type=String.class, parameters={})
    private Output<String> signingSecret;

    /**
     * @return Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    public Output<String> signingSecret() {
        return this.signingSecret;
    }
    /**
     * Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    @Export(name="skipConsentForVerifiableFirstPartyClients", type=Boolean.class, parameters={})
    private Output<Boolean> skipConsentForVerifiableFirstPartyClients;

    /**
     * @return Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    public Output<Boolean> skipConsentForVerifiableFirstPartyClients() {
        return this.skipConsentForVerifiableFirstPartyClients;
    }
    /**
     * Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
     * 
     */
    @Export(name="tokenDialect", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenDialect;

    /**
     * @return Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
     * 
     */
    public Output<Optional<String>> tokenDialect() {
        return Codegen.optional(this.tokenDialect);
    }
    /**
     * Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    @Export(name="tokenLifetime", type=Integer.class, parameters={})
    private Output<Integer> tokenLifetime;

    /**
     * @return Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    public Output<Integer> tokenLifetime() {
        return this.tokenLifetime;
    }
    /**
     * Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    @Export(name="tokenLifetimeForWeb", type=Integer.class, parameters={})
    private Output<Integer> tokenLifetimeForWeb;

    /**
     * @return Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    public Output<Integer> tokenLifetimeForWeb() {
        return this.tokenLifetimeForWeb;
    }
    /**
     * URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     * 
     */
    @Export(name="verificationLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> verificationLocation;

    /**
     * @return URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     * 
     */
    public Output<Optional<String>> verificationLocation() {
        return Codegen.optional(this.verificationLocation);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceServer(String name) {
        this(name, ResourceServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceServer(String name, ResourceServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceServer(String name, ResourceServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/resourceServer:ResourceServer", name, args == null ? ResourceServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceServer(String name, Output<String> id, @Nullable ResourceServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/resourceServer:ResourceServer", name, state, makeResourceOptions(options, id));
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
    public static ResourceServer get(String name, Output<String> id, @Nullable ResourceServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceServer(name, id, state, options);
    }
}
