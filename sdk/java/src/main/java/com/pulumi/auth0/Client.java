// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ClientArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ClientState;
import com.pulumi.auth0.outputs.ClientAddons;
import com.pulumi.auth0.outputs.ClientJwtConfiguration;
import com.pulumi.auth0.outputs.ClientMobile;
import com.pulumi.auth0.outputs.ClientNativeSocialLogin;
import com.pulumi.auth0.outputs.ClientRefreshToken;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can set up applications that use Auth0 for authentication and configure allowed callback URLs and secrets for these applications.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Client;
 * import com.pulumi.auth0.ClientArgs;
 * import com.pulumi.auth0.inputs.ClientAddonsArgs;
 * import com.pulumi.auth0.inputs.ClientAddonsSamlpArgs;
 * import com.pulumi.auth0.inputs.ClientJwtConfigurationArgs;
 * import com.pulumi.auth0.inputs.ClientMobileArgs;
 * import com.pulumi.auth0.inputs.ClientMobileIosArgs;
 * import com.pulumi.auth0.inputs.ClientRefreshTokenArgs;
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
 *         var myClient = new Client(&#34;myClient&#34;, ClientArgs.builder()        
 *             .addons(ClientAddonsArgs.builder()
 *                 .samlp(ClientAddonsSamlpArgs.builder()
 *                     .audience(&#34;https://example.com/saml&#34;)
 *                     .createUpnClaim(false)
 *                     .issuer(&#34;https://example.com&#34;)
 *                     .mapIdentities(false)
 *                     .mapUnknownClaimsAsIs(false)
 *                     .mappings(Map.ofEntries(
 *                         Map.entry(&#34;email&#34;, &#34;http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress&#34;),
 *                         Map.entry(&#34;name&#34;, &#34;http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name&#34;)
 *                     ))
 *                     .nameIdentifierFormat(&#34;urn:oasis:names:tc:SAML:2.0:nameid-format:persistent&#34;)
 *                     .nameIdentifierProbes(&#34;http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress&#34;)
 *                     .passthroughClaimsWithNoMapping(false)
 *                     .signingCert(&#34;&#34;&#34;
 * -----BEGIN PUBLIC KEY-----
 * MIGf...bpP/t3
 * +JGNGIRMj1hF1rnb6QIDAQAB
 * -----END PUBLIC KEY-----
 * 
 *                     &#34;&#34;&#34;)
 *                     .signingKey(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .build())
 *                 .build())
 *             .allowedLogoutUrls(&#34;https://example.com&#34;)
 *             .allowedOrigins(&#34;https://example.com&#34;)
 *             .appType(&#34;non_interactive&#34;)
 *             .callbacks(&#34;https://example.com/callback&#34;)
 *             .clientMetadata(Map.of(&#34;foo&#34;, &#34;zoo&#34;))
 *             .customLoginPageOn(true)
 *             .description(&#34;Test Applications Long Description&#34;)
 *             .grantTypes(            
 *                 &#34;authorization_code&#34;,
 *                 &#34;http://auth0.com/oauth/grant-type/password-realm&#34;,
 *                 &#34;implicit&#34;,
 *                 &#34;password&#34;,
 *                 &#34;refresh_token&#34;)
 *             .isFirstParty(true)
 *             .isTokenEndpointIpHeaderTrusted(true)
 *             .jwtConfiguration(ClientJwtConfigurationArgs.builder()
 *                 .alg(&#34;RS256&#34;)
 *                 .lifetimeInSeconds(300)
 *                 .scopes(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *                 .secretEncoded(true)
 *                 .build())
 *             .mobile(ClientMobileArgs.builder()
 *                 .ios(ClientMobileIosArgs.builder()
 *                     .appBundleIdentifier(&#34;com.my.bundle.id&#34;)
 *                     .teamId(&#34;9JA89QQLNQ&#34;)
 *                     .build())
 *                 .build())
 *             .oidcConformant(false)
 *             .refreshToken(ClientRefreshTokenArgs.builder()
 *                 .expirationType(&#34;expiring&#34;)
 *                 .leeway(0)
 *                 .rotationType(&#34;rotating&#34;)
 *                 .tokenLifetime(2592000)
 *                 .build())
 *             .tokenEndpointAuthMethod(&#34;client_secret_post&#34;)
 *             .webOrigins(&#34;https://example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * A client can be imported using the client&#39;s ID. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/client:Client my_client AaiyAPdpYdesoKnqjj8HJqRn4T5titww
 * ```
 * 
 */
@ResourceType(type="auth0:index/client:Client")
public class Client extends com.pulumi.resources.CustomResource {
    /**
     * Addons enabled for this client and their associated configurations.
     * 
     */
    @Export(name="addons", type=ClientAddons.class, parameters={})
    private Output<ClientAddons> addons;

    /**
     * @return Addons enabled for this client and their associated configurations.
     * 
     */
    public Output<ClientAddons> addons() {
        return this.addons;
    }
    /**
     * List of applications ID&#39;s that will be allowed to make delegation request. By default, all applications will be allowed.
     * 
     */
    @Export(name="allowedClients", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedClients;

    /**
     * @return List of applications ID&#39;s that will be allowed to make delegation request. By default, all applications will be allowed.
     * 
     */
    public Output<Optional<List<String>>> allowedClients() {
        return Codegen.optional(this.allowedClients);
    }
    /**
     * URLs that Auth0 may redirect to after logout.
     * 
     */
    @Export(name="allowedLogoutUrls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedLogoutUrls;

    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    public Output<Optional<List<String>>> allowedLogoutUrls() {
        return Codegen.optional(this.allowedLogoutUrls);
    }
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     * 
     */
    @Export(name="allowedOrigins", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedOrigins;

    /**
     * @return URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     * 
     */
    public Output<Optional<List<String>>> allowedOrigins() {
        return Codegen.optional(this.allowedOrigins);
    }
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     * 
     */
    @Export(name="appType", type=String.class, parameters={})
    private Output</* @Nullable */ String> appType;

    /**
     * @return Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     * 
     */
    public Output<Optional<String>> appType() {
        return Codegen.optional(this.appType);
    }
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     * 
     */
    @Export(name="callbacks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> callbacks;

    /**
     * @return URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     * 
     */
    public Output<Optional<List<String>>> callbacks() {
        return Codegen.optional(this.callbacks);
    }
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     * 
     */
    @Export(name="clientAliases", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clientAliases;

    /**
     * @return List of audiences/realms for SAML protocol. Used by the wsfed addon.
     * 
     */
    public Output<Optional<List<String>>> clientAliases() {
        return Codegen.optional(this.clientAliases);
    }
    /**
     * The ID of the client.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The ID of the client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?&#34;/\()&lt;&gt;@ [Tab] [Space]`.
     * 
     */
    @Export(name="clientMetadata", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> clientMetadata;

    /**
     * @return Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?&#34;/\()&lt;&gt;@ [Tab] [Space]`.
     * 
     */
    public Output<Optional<Map<String,Object>>> clientMetadata() {
        return Codegen.optional(this.clientMetadata);
    }
    /**
     * Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string.
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * Custom metadata for the rotation. For more info: [rotate-client-secret](https://auth0.com/docs/get-started/applications/rotate-client-secret).
     * 
     */
    @Export(name="clientSecretRotationTrigger", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> clientSecretRotationTrigger;

    /**
     * @return Custom metadata for the rotation. For more info: [rotate-client-secret](https://auth0.com/docs/get-started/applications/rotate-client-secret).
     * 
     */
    public Output<Optional<Map<String,Object>>> clientSecretRotationTrigger() {
        return Codegen.optional(this.clientSecretRotationTrigger);
    }
    /**
     * Whether this client can be used to make cross-origin authentication requests (true) or it is not allowed to make such requests (false).
     * 
     */
    @Export(name="crossOriginAuth", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> crossOriginAuth;

    /**
     * @return Whether this client can be used to make cross-origin authentication requests (true) or it is not allowed to make such requests (false).
     * 
     */
    public Output<Optional<Boolean>> crossOriginAuth() {
        return Codegen.optional(this.crossOriginAuth);
    }
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     * 
     */
    @Export(name="crossOriginLoc", type=String.class, parameters={})
    private Output</* @Nullable */ String> crossOriginLoc;

    /**
     * @return URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     * 
     */
    public Output<Optional<String>> crossOriginLoc() {
        return Codegen.optional(this.crossOriginLoc);
    }
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     * 
     */
    @Export(name="customLoginPage", type=String.class, parameters={})
    private Output</* @Nullable */ String> customLoginPage;

    /**
     * @return The content (HTML, CSS, JS) of the custom login page.
     * 
     */
    public Output<Optional<String>> customLoginPage() {
        return Codegen.optional(this.customLoginPage);
    }
    /**
     * Indicates whether a custom login page is to be used.
     * 
     */
    @Export(name="customLoginPageOn", type=Boolean.class, parameters={})
    private Output<Boolean> customLoginPageOn;

    /**
     * @return Indicates whether a custom login page is to be used.
     * 
     */
    public Output<Boolean> customLoginPageOn() {
        return this.customLoginPageOn;
    }
    /**
     * Description of the purpose of the client.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the purpose of the client.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Encryption used for WS-Fed responses with this client.
     * 
     */
    @Export(name="encryptionKey", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> encryptionKey;

    /**
     * @return Encryption used for WS-Fed responses with this client.
     * 
     */
    public Output<Optional<Map<String,String>>> encryptionKey() {
        return Codegen.optional(this.encryptionKey);
    }
    /**
     * HTML form template to be used for WS-Federation.
     * 
     */
    @Export(name="formTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> formTemplate;

    /**
     * @return HTML form template to be used for WS-Federation.
     * 
     */
    public Output<Optional<String>> formTemplate() {
        return Codegen.optional(this.formTemplate);
    }
    /**
     * Types of grants that this client is authorized to use.
     * 
     */
    @Export(name="grantTypes", type=List.class, parameters={String.class})
    private Output<List<String>> grantTypes;

    /**
     * @return Types of grants that this client is authorized to use.
     * 
     */
    public Output<List<String>> grantTypes() {
        return this.grantTypes;
    }
    /**
     * Initiate login URI, must be HTTPS.
     * 
     */
    @Export(name="initiateLoginUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> initiateLoginUri;

    /**
     * @return Initiate login URI, must be HTTPS.
     * 
     */
    public Output<Optional<String>> initiateLoginUri() {
        return Codegen.optional(this.initiateLoginUri);
    }
    /**
     * Indicates whether this client is a first-party client.
     * 
     */
    @Export(name="isFirstParty", type=Boolean.class, parameters={})
    private Output<Boolean> isFirstParty;

    /**
     * @return Indicates whether this client is a first-party client.
     * 
     */
    public Output<Boolean> isFirstParty() {
        return this.isFirstParty;
    }
    /**
     * Indicates whether the token endpoint IP header is trusted.
     * 
     */
    @Export(name="isTokenEndpointIpHeaderTrusted", type=Boolean.class, parameters={})
    private Output<Boolean> isTokenEndpointIpHeaderTrusted;

    /**
     * @return Indicates whether the token endpoint IP header is trusted.
     * 
     */
    public Output<Boolean> isTokenEndpointIpHeaderTrusted() {
        return this.isTokenEndpointIpHeaderTrusted;
    }
    /**
     * Configuration settings for the JWTs issued for this client.
     * 
     */
    @Export(name="jwtConfiguration", type=ClientJwtConfiguration.class, parameters={})
    private Output<ClientJwtConfiguration> jwtConfiguration;

    /**
     * @return Configuration settings for the JWTs issued for this client.
     * 
     */
    public Output<ClientJwtConfiguration> jwtConfiguration() {
        return this.jwtConfiguration;
    }
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     * 
     */
    @Export(name="logoUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> logoUri;

    /**
     * @return URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     * 
     */
    public Output<Optional<String>> logoUri() {
        return Codegen.optional(this.logoUri);
    }
    /**
     * Additional configuration for native mobile apps.
     * 
     */
    @Export(name="mobile", type=ClientMobile.class, parameters={})
    private Output<ClientMobile> mobile;

    /**
     * @return Additional configuration for native mobile apps.
     * 
     */
    public Output<ClientMobile> mobile() {
        return this.mobile;
    }
    /**
     * Name of the client.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the client.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
     * 
     */
    @Export(name="nativeSocialLogin", type=ClientNativeSocialLogin.class, parameters={})
    private Output<ClientNativeSocialLogin> nativeSocialLogin;

    /**
     * @return Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
     * 
     */
    public Output<ClientNativeSocialLogin> nativeSocialLogin() {
        return this.nativeSocialLogin;
    }
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     * 
     */
    @Export(name="oidcConformant", type=Boolean.class, parameters={})
    private Output<Boolean> oidcConformant;

    /**
     * @return Indicates whether this client will conform to strict OIDC specifications.
     * 
     */
    public Output<Boolean> oidcConformant() {
        return this.oidcConformant;
    }
    /**
     * Defines how to proceed during an authentication transaction when `organization_usage = &#34;require&#34;`. Can be `no_prompt` (default) or `pre_login_prompt`.
     * 
     */
    @Export(name="organizationRequireBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> organizationRequireBehavior;

    /**
     * @return Defines how to proceed during an authentication transaction when `organization_usage = &#34;require&#34;`. Can be `no_prompt` (default) or `pre_login_prompt`.
     * 
     */
    public Output<Optional<String>> organizationRequireBehavior() {
        return Codegen.optional(this.organizationRequireBehavior);
    }
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     * 
     */
    @Export(name="organizationUsage", type=String.class, parameters={})
    private Output</* @Nullable */ String> organizationUsage;

    /**
     * @return Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     * 
     */
    public Output<Optional<String>> organizationUsage() {
        return Codegen.optional(this.organizationUsage);
    }
    /**
     * Configuration settings for the refresh tokens issued for this client.
     * 
     */
    @Export(name="refreshToken", type=ClientRefreshToken.class, parameters={})
    private Output<ClientRefreshToken> refreshToken;

    /**
     * @return Configuration settings for the refresh tokens issued for this client.
     * 
     */
    public Output<ClientRefreshToken> refreshToken() {
        return this.refreshToken;
    }
    /**
     * List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     * 
     */
    @Export(name="signingKeys", type=List.class, parameters={Map.class})
    private Output<List<Map<String,Object>>> signingKeys;

    /**
     * @return List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     * 
     */
    public Output<List<Map<String,Object>>> signingKeys() {
        return this.signingKeys;
    }
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     * 
     */
    @Export(name="sso", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sso;

    /**
     * @return Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     * 
     */
    public Output<Optional<Boolean>> sso() {
        return Codegen.optional(this.sso);
    }
    /**
     * Indicates whether or not SSO is disabled.
     * 
     */
    @Export(name="ssoDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ssoDisabled;

    /**
     * @return Indicates whether or not SSO is disabled.
     * 
     */
    public Output<Optional<Boolean>> ssoDisabled() {
        return Codegen.optional(this.ssoDisabled);
    }
    /**
     * Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
     * 
     */
    @Export(name="tokenEndpointAuthMethod", type=String.class, parameters={})
    private Output<String> tokenEndpointAuthMethod;

    /**
     * @return Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
     * 
     */
    public Output<String> tokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }
    /**
     * URLs that represent valid web origins for use with web message response mode.
     * 
     */
    @Export(name="webOrigins", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> webOrigins;

    /**
     * @return URLs that represent valid web origins for use with web message response mode.
     * 
     */
    public Output<Optional<List<String>>> webOrigins() {
        return Codegen.optional(this.webOrigins);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Client(String name) {
        this(name, ClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Client(String name, @Nullable ClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Client(String name, @Nullable ClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/client:Client", name, args == null ? ClientArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Client(String name, Output<String> id, @Nullable ClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/client:Client", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret",
                "signingKeys"
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
    public static Client get(String name, Output<String> id, @Nullable ClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Client(name, id, state, options);
    }
}
