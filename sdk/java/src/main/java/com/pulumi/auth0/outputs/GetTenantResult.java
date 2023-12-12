// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetTenantFlag;
import com.pulumi.auth0.outputs.GetTenantSession;
import com.pulumi.auth0.outputs.GetTenantSessionCooky;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTenantResult {
    /**
     * @return Whether to accept an organization name instead of an ID on auth endpoints.
     * 
     */
    private Boolean allowOrganizationNameInAuthenticationApi;
    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    private List<String> allowedLogoutUrls;
    /**
     * @return Whether to enable flexible factors for MFA in the PostLogin action.
     * 
     */
    private Boolean customizeMfaInPostloginAction;
    /**
     * @return API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     * 
     */
    private String defaultAudience;
    /**
     * @return Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     * 
     */
    private String defaultDirectory;
    /**
     * @return The default absolute redirection URI. Must be HTTPS or an empty string.
     * 
     */
    private String defaultRedirectionUri;
    /**
     * @return Your Auth0 domain name.
     * 
     */
    private String domain;
    /**
     * @return Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     * 
     */
    private List<String> enabledLocales;
    /**
     * @return Configuration settings for tenant flags.
     * 
     */
    private List<GetTenantFlag> flags;
    /**
     * @return Friendly name for the tenant.
     * 
     */
    private String friendlyName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Number of hours during which a session can be inactive before the user must log in again.
     * 
     */
    private Double idleSessionLifetime;
    /**
     * @return The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
     * 
     */
    private String managementApiIdentifier;
    /**
     * @return URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     * 
     */
    private String pictureUrl;
    /**
     * @return Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
     * 
     */
    private String sandboxVersion;
    /**
     * @return Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
     * 
     */
    private List<GetTenantSessionCooky> sessionCookies;
    /**
     * @return Number of hours during which a session will stay valid.
     * 
     */
    private Double sessionLifetime;
    /**
     * @return Sessions related settings for the tenant.
     * 
     */
    private List<GetTenantSession> sessions;
    /**
     * @return Support email address for authenticating users.
     * 
     */
    private String supportEmail;
    /**
     * @return Support URL for authenticating users.
     * 
     */
    private String supportUrl;

    private GetTenantResult() {}
    /**
     * @return Whether to accept an organization name instead of an ID on auth endpoints.
     * 
     */
    public Boolean allowOrganizationNameInAuthenticationApi() {
        return this.allowOrganizationNameInAuthenticationApi;
    }
    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    public List<String> allowedLogoutUrls() {
        return this.allowedLogoutUrls;
    }
    /**
     * @return Whether to enable flexible factors for MFA in the PostLogin action.
     * 
     */
    public Boolean customizeMfaInPostloginAction() {
        return this.customizeMfaInPostloginAction;
    }
    /**
     * @return API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     * 
     */
    public String defaultAudience() {
        return this.defaultAudience;
    }
    /**
     * @return Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     * 
     */
    public String defaultDirectory() {
        return this.defaultDirectory;
    }
    /**
     * @return The default absolute redirection URI. Must be HTTPS or an empty string.
     * 
     */
    public String defaultRedirectionUri() {
        return this.defaultRedirectionUri;
    }
    /**
     * @return Your Auth0 domain name.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     * 
     */
    public List<String> enabledLocales() {
        return this.enabledLocales;
    }
    /**
     * @return Configuration settings for tenant flags.
     * 
     */
    public List<GetTenantFlag> flags() {
        return this.flags;
    }
    /**
     * @return Friendly name for the tenant.
     * 
     */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Number of hours during which a session can be inactive before the user must log in again.
     * 
     */
    public Double idleSessionLifetime() {
        return this.idleSessionLifetime;
    }
    /**
     * @return The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
     * 
     */
    public String managementApiIdentifier() {
        return this.managementApiIdentifier;
    }
    /**
     * @return URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     * 
     */
    public String pictureUrl() {
        return this.pictureUrl;
    }
    /**
     * @return Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
     * 
     */
    public String sandboxVersion() {
        return this.sandboxVersion;
    }
    /**
     * @return Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
     * 
     */
    public List<GetTenantSessionCooky> sessionCookies() {
        return this.sessionCookies;
    }
    /**
     * @return Number of hours during which a session will stay valid.
     * 
     */
    public Double sessionLifetime() {
        return this.sessionLifetime;
    }
    /**
     * @return Sessions related settings for the tenant.
     * 
     */
    public List<GetTenantSession> sessions() {
        return this.sessions;
    }
    /**
     * @return Support email address for authenticating users.
     * 
     */
    public String supportEmail() {
        return this.supportEmail;
    }
    /**
     * @return Support URL for authenticating users.
     * 
     */
    public String supportUrl() {
        return this.supportUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowOrganizationNameInAuthenticationApi;
        private List<String> allowedLogoutUrls;
        private Boolean customizeMfaInPostloginAction;
        private String defaultAudience;
        private String defaultDirectory;
        private String defaultRedirectionUri;
        private String domain;
        private List<String> enabledLocales;
        private List<GetTenantFlag> flags;
        private String friendlyName;
        private String id;
        private Double idleSessionLifetime;
        private String managementApiIdentifier;
        private String pictureUrl;
        private String sandboxVersion;
        private List<GetTenantSessionCooky> sessionCookies;
        private Double sessionLifetime;
        private List<GetTenantSession> sessions;
        private String supportEmail;
        private String supportUrl;
        public Builder() {}
        public Builder(GetTenantResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOrganizationNameInAuthenticationApi = defaults.allowOrganizationNameInAuthenticationApi;
    	      this.allowedLogoutUrls = defaults.allowedLogoutUrls;
    	      this.customizeMfaInPostloginAction = defaults.customizeMfaInPostloginAction;
    	      this.defaultAudience = defaults.defaultAudience;
    	      this.defaultDirectory = defaults.defaultDirectory;
    	      this.defaultRedirectionUri = defaults.defaultRedirectionUri;
    	      this.domain = defaults.domain;
    	      this.enabledLocales = defaults.enabledLocales;
    	      this.flags = defaults.flags;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.idleSessionLifetime = defaults.idleSessionLifetime;
    	      this.managementApiIdentifier = defaults.managementApiIdentifier;
    	      this.pictureUrl = defaults.pictureUrl;
    	      this.sandboxVersion = defaults.sandboxVersion;
    	      this.sessionCookies = defaults.sessionCookies;
    	      this.sessionLifetime = defaults.sessionLifetime;
    	      this.sessions = defaults.sessions;
    	      this.supportEmail = defaults.supportEmail;
    	      this.supportUrl = defaults.supportUrl;
        }

        @CustomType.Setter
        public Builder allowOrganizationNameInAuthenticationApi(Boolean allowOrganizationNameInAuthenticationApi) {
            this.allowOrganizationNameInAuthenticationApi = Objects.requireNonNull(allowOrganizationNameInAuthenticationApi);
            return this;
        }
        @CustomType.Setter
        public Builder allowedLogoutUrls(List<String> allowedLogoutUrls) {
            this.allowedLogoutUrls = Objects.requireNonNull(allowedLogoutUrls);
            return this;
        }
        public Builder allowedLogoutUrls(String... allowedLogoutUrls) {
            return allowedLogoutUrls(List.of(allowedLogoutUrls));
        }
        @CustomType.Setter
        public Builder customizeMfaInPostloginAction(Boolean customizeMfaInPostloginAction) {
            this.customizeMfaInPostloginAction = Objects.requireNonNull(customizeMfaInPostloginAction);
            return this;
        }
        @CustomType.Setter
        public Builder defaultAudience(String defaultAudience) {
            this.defaultAudience = Objects.requireNonNull(defaultAudience);
            return this;
        }
        @CustomType.Setter
        public Builder defaultDirectory(String defaultDirectory) {
            this.defaultDirectory = Objects.requireNonNull(defaultDirectory);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRedirectionUri(String defaultRedirectionUri) {
            this.defaultRedirectionUri = Objects.requireNonNull(defaultRedirectionUri);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder enabledLocales(List<String> enabledLocales) {
            this.enabledLocales = Objects.requireNonNull(enabledLocales);
            return this;
        }
        public Builder enabledLocales(String... enabledLocales) {
            return enabledLocales(List.of(enabledLocales));
        }
        @CustomType.Setter
        public Builder flags(List<GetTenantFlag> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        public Builder flags(GetTenantFlag... flags) {
            return flags(List.of(flags));
        }
        @CustomType.Setter
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder idleSessionLifetime(Double idleSessionLifetime) {
            this.idleSessionLifetime = Objects.requireNonNull(idleSessionLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder managementApiIdentifier(String managementApiIdentifier) {
            this.managementApiIdentifier = Objects.requireNonNull(managementApiIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder pictureUrl(String pictureUrl) {
            this.pictureUrl = Objects.requireNonNull(pictureUrl);
            return this;
        }
        @CustomType.Setter
        public Builder sandboxVersion(String sandboxVersion) {
            this.sandboxVersion = Objects.requireNonNull(sandboxVersion);
            return this;
        }
        @CustomType.Setter
        public Builder sessionCookies(List<GetTenantSessionCooky> sessionCookies) {
            this.sessionCookies = Objects.requireNonNull(sessionCookies);
            return this;
        }
        public Builder sessionCookies(GetTenantSessionCooky... sessionCookies) {
            return sessionCookies(List.of(sessionCookies));
        }
        @CustomType.Setter
        public Builder sessionLifetime(Double sessionLifetime) {
            this.sessionLifetime = Objects.requireNonNull(sessionLifetime);
            return this;
        }
        @CustomType.Setter
        public Builder sessions(List<GetTenantSession> sessions) {
            this.sessions = Objects.requireNonNull(sessions);
            return this;
        }
        public Builder sessions(GetTenantSession... sessions) {
            return sessions(List.of(sessions));
        }
        @CustomType.Setter
        public Builder supportEmail(String supportEmail) {
            this.supportEmail = Objects.requireNonNull(supportEmail);
            return this;
        }
        @CustomType.Setter
        public Builder supportUrl(String supportUrl) {
            this.supportUrl = Objects.requireNonNull(supportUrl);
            return this;
        }
        public GetTenantResult build() {
            final var _resultValue = new GetTenantResult();
            _resultValue.allowOrganizationNameInAuthenticationApi = allowOrganizationNameInAuthenticationApi;
            _resultValue.allowedLogoutUrls = allowedLogoutUrls;
            _resultValue.customizeMfaInPostloginAction = customizeMfaInPostloginAction;
            _resultValue.defaultAudience = defaultAudience;
            _resultValue.defaultDirectory = defaultDirectory;
            _resultValue.defaultRedirectionUri = defaultRedirectionUri;
            _resultValue.domain = domain;
            _resultValue.enabledLocales = enabledLocales;
            _resultValue.flags = flags;
            _resultValue.friendlyName = friendlyName;
            _resultValue.id = id;
            _resultValue.idleSessionLifetime = idleSessionLifetime;
            _resultValue.managementApiIdentifier = managementApiIdentifier;
            _resultValue.pictureUrl = pictureUrl;
            _resultValue.sandboxVersion = sandboxVersion;
            _resultValue.sessionCookies = sessionCookies;
            _resultValue.sessionLifetime = sessionLifetime;
            _resultValue.sessions = sessions;
            _resultValue.supportEmail = supportEmail;
            _resultValue.supportUrl = supportUrl;
            return _resultValue;
        }
    }
}
