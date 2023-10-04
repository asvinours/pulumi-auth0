// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.TenantArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.TenantState;
import com.pulumi.auth0.outputs.TenantFlags;
import com.pulumi.auth0.outputs.TenantSessionCookie;
import com.pulumi.auth0.outputs.TenantSessions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage Auth0 tenants, including setting logos and support contact information, setting error pages, and configuring default tenant behaviors.
 * 
 * &gt; Creating tenants through the Management API is not currently supported. Therefore, this resource can only
 * manage an existing tenant created through the Auth0 dashboard.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Tenant;
 * import com.pulumi.auth0.TenantArgs;
 * import com.pulumi.auth0.inputs.TenantFlagsArgs;
 * import com.pulumi.auth0.inputs.TenantSessionCookieArgs;
 * import com.pulumi.auth0.inputs.TenantSessionsArgs;
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
 *         var myTenant = new Tenant(&#34;myTenant&#34;, TenantArgs.builder()        
 *             .allowedLogoutUrls(&#34;http://example.com/logout&#34;)
 *             .defaultRedirectionUri(&#34;https://example.com/login&#34;)
 *             .enabledLocales(&#34;en&#34;)
 *             .flags(TenantFlagsArgs.builder()
 *                 .disableClickjackProtectionHeaders(true)
 *                 .disableFieldsMapFix(false)
 *                 .disableManagementApiSmsObfuscation(false)
 *                 .enablePublicSignupUserExistsError(true)
 *                 .noDiscloseEnterpriseConnections(false)
 *                 .useScopeDescriptionsForConsent(true)
 *                 .build())
 *             .friendlyName(&#34;Tenant Name&#34;)
 *             .pictureUrl(&#34;http://example.com/logo.png&#34;)
 *             .sandboxVersion(&#34;12&#34;)
 *             .sessionCookie(TenantSessionCookieArgs.builder()
 *                 .mode(&#34;non-persistent&#34;)
 *                 .build())
 *             .sessionLifetime(8760)
 *             .sessions(TenantSessionsArgs.builder()
 *                 .oidcLogoutPromptEnabled(false)
 *                 .build())
 *             .supportEmail(&#34;support@example.com&#34;)
 *             .supportUrl(&#34;http://example.com/support&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API, tenant can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/tenant:Tenant my_tenant &#34;82f4f21b-017a-319d-92e7-2291c1ca36c4&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/tenant:Tenant")
public class Tenant extends com.pulumi.resources.CustomResource {
    /**
     * Whether to accept an organization name instead of an ID on auth endpoints.
     * 
     */
    @Export(name="allowOrganizationNameInAuthenticationApi", type=Boolean.class, parameters={})
    private Output<Boolean> allowOrganizationNameInAuthenticationApi;

    /**
     * @return Whether to accept an organization name instead of an ID on auth endpoints.
     * 
     */
    public Output<Boolean> allowOrganizationNameInAuthenticationApi() {
        return this.allowOrganizationNameInAuthenticationApi;
    }
    /**
     * URLs that Auth0 may redirect to after logout.
     * 
     */
    @Export(name="allowedLogoutUrls", type=List.class, parameters={String.class})
    private Output<List<String>> allowedLogoutUrls;

    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    public Output<List<String>> allowedLogoutUrls() {
        return this.allowedLogoutUrls;
    }
    /**
     * API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     * 
     */
    @Export(name="defaultAudience", type=String.class, parameters={})
    private Output<String> defaultAudience;

    /**
     * @return API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     * 
     */
    public Output<String> defaultAudience() {
        return this.defaultAudience;
    }
    /**
     * Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     * 
     */
    @Export(name="defaultDirectory", type=String.class, parameters={})
    private Output<String> defaultDirectory;

    /**
     * @return Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     * 
     */
    public Output<String> defaultDirectory() {
        return this.defaultDirectory;
    }
    /**
     * The default absolute redirection URI. Must be HTTPS or an empty string.
     * 
     */
    @Export(name="defaultRedirectionUri", type=String.class, parameters={})
    private Output<String> defaultRedirectionUri;

    /**
     * @return The default absolute redirection URI. Must be HTTPS or an empty string.
     * 
     */
    public Output<String> defaultRedirectionUri() {
        return this.defaultRedirectionUri;
    }
    /**
     * Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     * 
     */
    @Export(name="enabledLocales", type=List.class, parameters={String.class})
    private Output<List<String>> enabledLocales;

    /**
     * @return Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     * 
     */
    public Output<List<String>> enabledLocales() {
        return this.enabledLocales;
    }
    /**
     * Configuration settings for tenant flags.
     * 
     */
    @Export(name="flags", type=TenantFlags.class, parameters={})
    private Output<TenantFlags> flags;

    /**
     * @return Configuration settings for tenant flags.
     * 
     */
    public Output<TenantFlags> flags() {
        return this.flags;
    }
    /**
     * Friendly name for the tenant.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return Friendly name for the tenant.
     * 
     */
    public Output<String> friendlyName() {
        return this.friendlyName;
    }
    /**
     * Number of hours during which a session can be inactive before the user must log in again.
     * 
     */
    @Export(name="idleSessionLifetime", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> idleSessionLifetime;

    /**
     * @return Number of hours during which a session can be inactive before the user must log in again.
     * 
     */
    public Output<Optional<Double>> idleSessionLifetime() {
        return Codegen.optional(this.idleSessionLifetime);
    }
    /**
     * URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     * 
     */
    @Export(name="pictureUrl", type=String.class, parameters={})
    private Output<String> pictureUrl;

    /**
     * @return URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     * 
     */
    public Output<String> pictureUrl() {
        return this.pictureUrl;
    }
    /**
     * Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
     * 
     */
    @Export(name="sandboxVersion", type=String.class, parameters={})
    private Output<String> sandboxVersion;

    /**
     * @return Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
     * 
     */
    public Output<String> sandboxVersion() {
        return this.sandboxVersion;
    }
    /**
     * Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
     * 
     */
    @Export(name="sessionCookie", type=TenantSessionCookie.class, parameters={})
    private Output<TenantSessionCookie> sessionCookie;

    /**
     * @return Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
     * 
     */
    public Output<TenantSessionCookie> sessionCookie() {
        return this.sessionCookie;
    }
    /**
     * Number of hours during which a session will stay valid.
     * 
     */
    @Export(name="sessionLifetime", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> sessionLifetime;

    /**
     * @return Number of hours during which a session will stay valid.
     * 
     */
    public Output<Optional<Double>> sessionLifetime() {
        return Codegen.optional(this.sessionLifetime);
    }
    /**
     * Sessions related settings for the tenant.
     * 
     */
    @Export(name="sessions", type=TenantSessions.class, parameters={})
    private Output<TenantSessions> sessions;

    /**
     * @return Sessions related settings for the tenant.
     * 
     */
    public Output<TenantSessions> sessions() {
        return this.sessions;
    }
    /**
     * Support email address for authenticating users.
     * 
     */
    @Export(name="supportEmail", type=String.class, parameters={})
    private Output<String> supportEmail;

    /**
     * @return Support email address for authenticating users.
     * 
     */
    public Output<String> supportEmail() {
        return this.supportEmail;
    }
    /**
     * Support URL for authenticating users.
     * 
     */
    @Export(name="supportUrl", type=String.class, parameters={})
    private Output<String> supportUrl;

    /**
     * @return Support URL for authenticating users.
     * 
     */
    public Output<String> supportUrl() {
        return this.supportUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tenant(String name) {
        this(name, TenantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tenant(String name, @Nullable TenantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tenant(String name, @Nullable TenantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/tenant:Tenant", name, args == null ? TenantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tenant(String name, Output<String> id, @Nullable TenantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/tenant:Tenant", name, state, makeResourceOptions(options, id));
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
    public static Tenant get(String name, Output<String> id, @Nullable TenantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tenant(name, id, state, options);
    }
}
