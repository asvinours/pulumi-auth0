// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetGlobalClientAddon;
import com.pulumi.auth0.outputs.GetGlobalClientJwtConfiguration;
import com.pulumi.auth0.outputs.GetGlobalClientMobile;
import com.pulumi.auth0.outputs.GetGlobalClientNativeSocialLogin;
import com.pulumi.auth0.outputs.GetGlobalClientRefreshToken;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalClientResult {
    private List<GetGlobalClientAddon> addons;
    private List<String> allowedClients;
    private List<String> allowedLogoutUrls;
    private List<String> allowedOrigins;
    private String appType;
    private List<String> callbacks;
    /**
     * @return String. ID of the client.
     * * `client_secret`&lt;sup&gt;1&lt;/sup&gt; - String. Secret for the client; keep this private.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return (Optional) Map(String)
     * 
     */
    private Map<String,Object> clientMetadata;
    private String clientSecret;
    private Boolean crossOriginAuth;
    private String crossOriginLoc;
    /**
     * @return String. Content of the custom login page.
     * 
     */
    private String customLoginPage;
    /**
     * @return Boolean. Indicates whether a custom login page is to be used.
     * 
     */
    private Boolean customLoginPageOn;
    private String description;
    private Map<String,String> encryptionKey;
    private String formTemplate;
    private List<String> grantTypes;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String initiateLoginUri;
    private Boolean isFirstParty;
    private Boolean isTokenEndpointIpHeaderTrusted;
    private List<GetGlobalClientJwtConfiguration> jwtConfigurations;
    private String logoUri;
    private List<GetGlobalClientMobile> mobiles;
    private @Nullable String name;
    private List<GetGlobalClientNativeSocialLogin> nativeSocialLogins;
    private Boolean oidcConformant;
    private String organizationRequireBehavior;
    private String organizationUsage;
    private List<GetGlobalClientRefreshToken> refreshTokens;
    private List<Map<String,Object>> signingKeys;
    private Boolean sso;
    private Boolean ssoDisabled;
    private String tokenEndpointAuthMethod;
    private List<String> webOrigins;

    private GetGlobalClientResult() {}
    public List<GetGlobalClientAddon> addons() {
        return this.addons;
    }
    public List<String> allowedClients() {
        return this.allowedClients;
    }
    public List<String> allowedLogoutUrls() {
        return this.allowedLogoutUrls;
    }
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    public String appType() {
        return this.appType;
    }
    public List<String> callbacks() {
        return this.callbacks;
    }
    /**
     * @return String. ID of the client.
     * * `client_secret`&lt;sup&gt;1&lt;/sup&gt; - String. Secret for the client; keep this private.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return (Optional) Map(String)
     * 
     */
    public Map<String,Object> clientMetadata() {
        return this.clientMetadata;
    }
    public String clientSecret() {
        return this.clientSecret;
    }
    public Boolean crossOriginAuth() {
        return this.crossOriginAuth;
    }
    public String crossOriginLoc() {
        return this.crossOriginLoc;
    }
    /**
     * @return String. Content of the custom login page.
     * 
     */
    public String customLoginPage() {
        return this.customLoginPage;
    }
    /**
     * @return Boolean. Indicates whether a custom login page is to be used.
     * 
     */
    public Boolean customLoginPageOn() {
        return this.customLoginPageOn;
    }
    public String description() {
        return this.description;
    }
    public Map<String,String> encryptionKey() {
        return this.encryptionKey;
    }
    public String formTemplate() {
        return this.formTemplate;
    }
    public List<String> grantTypes() {
        return this.grantTypes;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String initiateLoginUri() {
        return this.initiateLoginUri;
    }
    public Boolean isFirstParty() {
        return this.isFirstParty;
    }
    public Boolean isTokenEndpointIpHeaderTrusted() {
        return this.isTokenEndpointIpHeaderTrusted;
    }
    public List<GetGlobalClientJwtConfiguration> jwtConfigurations() {
        return this.jwtConfigurations;
    }
    public String logoUri() {
        return this.logoUri;
    }
    public List<GetGlobalClientMobile> mobiles() {
        return this.mobiles;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<GetGlobalClientNativeSocialLogin> nativeSocialLogins() {
        return this.nativeSocialLogins;
    }
    public Boolean oidcConformant() {
        return this.oidcConformant;
    }
    public String organizationRequireBehavior() {
        return this.organizationRequireBehavior;
    }
    public String organizationUsage() {
        return this.organizationUsage;
    }
    public List<GetGlobalClientRefreshToken> refreshTokens() {
        return this.refreshTokens;
    }
    public List<Map<String,Object>> signingKeys() {
        return this.signingKeys;
    }
    public Boolean sso() {
        return this.sso;
    }
    public Boolean ssoDisabled() {
        return this.ssoDisabled;
    }
    public String tokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }
    public List<String> webOrigins() {
        return this.webOrigins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalClientResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGlobalClientAddon> addons;
        private List<String> allowedClients;
        private List<String> allowedLogoutUrls;
        private List<String> allowedOrigins;
        private String appType;
        private List<String> callbacks;
        private @Nullable String clientId;
        private Map<String,Object> clientMetadata;
        private String clientSecret;
        private Boolean crossOriginAuth;
        private String crossOriginLoc;
        private String customLoginPage;
        private Boolean customLoginPageOn;
        private String description;
        private Map<String,String> encryptionKey;
        private String formTemplate;
        private List<String> grantTypes;
        private String id;
        private String initiateLoginUri;
        private Boolean isFirstParty;
        private Boolean isTokenEndpointIpHeaderTrusted;
        private List<GetGlobalClientJwtConfiguration> jwtConfigurations;
        private String logoUri;
        private List<GetGlobalClientMobile> mobiles;
        private @Nullable String name;
        private List<GetGlobalClientNativeSocialLogin> nativeSocialLogins;
        private Boolean oidcConformant;
        private String organizationRequireBehavior;
        private String organizationUsage;
        private List<GetGlobalClientRefreshToken> refreshTokens;
        private List<Map<String,Object>> signingKeys;
        private Boolean sso;
        private Boolean ssoDisabled;
        private String tokenEndpointAuthMethod;
        private List<String> webOrigins;
        public Builder() {}
        public Builder(GetGlobalClientResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addons = defaults.addons;
    	      this.allowedClients = defaults.allowedClients;
    	      this.allowedLogoutUrls = defaults.allowedLogoutUrls;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.appType = defaults.appType;
    	      this.callbacks = defaults.callbacks;
    	      this.clientId = defaults.clientId;
    	      this.clientMetadata = defaults.clientMetadata;
    	      this.clientSecret = defaults.clientSecret;
    	      this.crossOriginAuth = defaults.crossOriginAuth;
    	      this.crossOriginLoc = defaults.crossOriginLoc;
    	      this.customLoginPage = defaults.customLoginPage;
    	      this.customLoginPageOn = defaults.customLoginPageOn;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.formTemplate = defaults.formTemplate;
    	      this.grantTypes = defaults.grantTypes;
    	      this.id = defaults.id;
    	      this.initiateLoginUri = defaults.initiateLoginUri;
    	      this.isFirstParty = defaults.isFirstParty;
    	      this.isTokenEndpointIpHeaderTrusted = defaults.isTokenEndpointIpHeaderTrusted;
    	      this.jwtConfigurations = defaults.jwtConfigurations;
    	      this.logoUri = defaults.logoUri;
    	      this.mobiles = defaults.mobiles;
    	      this.name = defaults.name;
    	      this.nativeSocialLogins = defaults.nativeSocialLogins;
    	      this.oidcConformant = defaults.oidcConformant;
    	      this.organizationRequireBehavior = defaults.organizationRequireBehavior;
    	      this.organizationUsage = defaults.organizationUsage;
    	      this.refreshTokens = defaults.refreshTokens;
    	      this.signingKeys = defaults.signingKeys;
    	      this.sso = defaults.sso;
    	      this.ssoDisabled = defaults.ssoDisabled;
    	      this.tokenEndpointAuthMethod = defaults.tokenEndpointAuthMethod;
    	      this.webOrigins = defaults.webOrigins;
        }

        @CustomType.Setter
        public Builder addons(List<GetGlobalClientAddon> addons) {
            this.addons = Objects.requireNonNull(addons);
            return this;
        }
        public Builder addons(GetGlobalClientAddon... addons) {
            return addons(List.of(addons));
        }
        @CustomType.Setter
        public Builder allowedClients(List<String> allowedClients) {
            this.allowedClients = Objects.requireNonNull(allowedClients);
            return this;
        }
        public Builder allowedClients(String... allowedClients) {
            return allowedClients(List.of(allowedClients));
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
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder appType(String appType) {
            this.appType = Objects.requireNonNull(appType);
            return this;
        }
        @CustomType.Setter
        public Builder callbacks(List<String> callbacks) {
            this.callbacks = Objects.requireNonNull(callbacks);
            return this;
        }
        public Builder callbacks(String... callbacks) {
            return callbacks(List.of(callbacks));
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientMetadata(Map<String,Object> clientMetadata) {
            this.clientMetadata = Objects.requireNonNull(clientMetadata);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        @CustomType.Setter
        public Builder crossOriginAuth(Boolean crossOriginAuth) {
            this.crossOriginAuth = Objects.requireNonNull(crossOriginAuth);
            return this;
        }
        @CustomType.Setter
        public Builder crossOriginLoc(String crossOriginLoc) {
            this.crossOriginLoc = Objects.requireNonNull(crossOriginLoc);
            return this;
        }
        @CustomType.Setter
        public Builder customLoginPage(String customLoginPage) {
            this.customLoginPage = Objects.requireNonNull(customLoginPage);
            return this;
        }
        @CustomType.Setter
        public Builder customLoginPageOn(Boolean customLoginPageOn) {
            this.customLoginPageOn = Objects.requireNonNull(customLoginPageOn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKey(Map<String,String> encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        @CustomType.Setter
        public Builder formTemplate(String formTemplate) {
            this.formTemplate = Objects.requireNonNull(formTemplate);
            return this;
        }
        @CustomType.Setter
        public Builder grantTypes(List<String> grantTypes) {
            this.grantTypes = Objects.requireNonNull(grantTypes);
            return this;
        }
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder initiateLoginUri(String initiateLoginUri) {
            this.initiateLoginUri = Objects.requireNonNull(initiateLoginUri);
            return this;
        }
        @CustomType.Setter
        public Builder isFirstParty(Boolean isFirstParty) {
            this.isFirstParty = Objects.requireNonNull(isFirstParty);
            return this;
        }
        @CustomType.Setter
        public Builder isTokenEndpointIpHeaderTrusted(Boolean isTokenEndpointIpHeaderTrusted) {
            this.isTokenEndpointIpHeaderTrusted = Objects.requireNonNull(isTokenEndpointIpHeaderTrusted);
            return this;
        }
        @CustomType.Setter
        public Builder jwtConfigurations(List<GetGlobalClientJwtConfiguration> jwtConfigurations) {
            this.jwtConfigurations = Objects.requireNonNull(jwtConfigurations);
            return this;
        }
        public Builder jwtConfigurations(GetGlobalClientJwtConfiguration... jwtConfigurations) {
            return jwtConfigurations(List.of(jwtConfigurations));
        }
        @CustomType.Setter
        public Builder logoUri(String logoUri) {
            this.logoUri = Objects.requireNonNull(logoUri);
            return this;
        }
        @CustomType.Setter
        public Builder mobiles(List<GetGlobalClientMobile> mobiles) {
            this.mobiles = Objects.requireNonNull(mobiles);
            return this;
        }
        public Builder mobiles(GetGlobalClientMobile... mobiles) {
            return mobiles(List.of(mobiles));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nativeSocialLogins(List<GetGlobalClientNativeSocialLogin> nativeSocialLogins) {
            this.nativeSocialLogins = Objects.requireNonNull(nativeSocialLogins);
            return this;
        }
        public Builder nativeSocialLogins(GetGlobalClientNativeSocialLogin... nativeSocialLogins) {
            return nativeSocialLogins(List.of(nativeSocialLogins));
        }
        @CustomType.Setter
        public Builder oidcConformant(Boolean oidcConformant) {
            this.oidcConformant = Objects.requireNonNull(oidcConformant);
            return this;
        }
        @CustomType.Setter
        public Builder organizationRequireBehavior(String organizationRequireBehavior) {
            this.organizationRequireBehavior = Objects.requireNonNull(organizationRequireBehavior);
            return this;
        }
        @CustomType.Setter
        public Builder organizationUsage(String organizationUsage) {
            this.organizationUsage = Objects.requireNonNull(organizationUsage);
            return this;
        }
        @CustomType.Setter
        public Builder refreshTokens(List<GetGlobalClientRefreshToken> refreshTokens) {
            this.refreshTokens = Objects.requireNonNull(refreshTokens);
            return this;
        }
        public Builder refreshTokens(GetGlobalClientRefreshToken... refreshTokens) {
            return refreshTokens(List.of(refreshTokens));
        }
        @CustomType.Setter
        public Builder signingKeys(List<Map<String,Object>> signingKeys) {
            this.signingKeys = Objects.requireNonNull(signingKeys);
            return this;
        }
        @CustomType.Setter
        public Builder sso(Boolean sso) {
            this.sso = Objects.requireNonNull(sso);
            return this;
        }
        @CustomType.Setter
        public Builder ssoDisabled(Boolean ssoDisabled) {
            this.ssoDisabled = Objects.requireNonNull(ssoDisabled);
            return this;
        }
        @CustomType.Setter
        public Builder tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
            this.tokenEndpointAuthMethod = Objects.requireNonNull(tokenEndpointAuthMethod);
            return this;
        }
        @CustomType.Setter
        public Builder webOrigins(List<String> webOrigins) {
            this.webOrigins = Objects.requireNonNull(webOrigins);
            return this;
        }
        public Builder webOrigins(String... webOrigins) {
            return webOrigins(List.of(webOrigins));
        }
        public GetGlobalClientResult build() {
            final var o = new GetGlobalClientResult();
            o.addons = addons;
            o.allowedClients = allowedClients;
            o.allowedLogoutUrls = allowedLogoutUrls;
            o.allowedOrigins = allowedOrigins;
            o.appType = appType;
            o.callbacks = callbacks;
            o.clientId = clientId;
            o.clientMetadata = clientMetadata;
            o.clientSecret = clientSecret;
            o.crossOriginAuth = crossOriginAuth;
            o.crossOriginLoc = crossOriginLoc;
            o.customLoginPage = customLoginPage;
            o.customLoginPageOn = customLoginPageOn;
            o.description = description;
            o.encryptionKey = encryptionKey;
            o.formTemplate = formTemplate;
            o.grantTypes = grantTypes;
            o.id = id;
            o.initiateLoginUri = initiateLoginUri;
            o.isFirstParty = isFirstParty;
            o.isTokenEndpointIpHeaderTrusted = isTokenEndpointIpHeaderTrusted;
            o.jwtConfigurations = jwtConfigurations;
            o.logoUri = logoUri;
            o.mobiles = mobiles;
            o.name = name;
            o.nativeSocialLogins = nativeSocialLogins;
            o.oidcConformant = oidcConformant;
            o.organizationRequireBehavior = organizationRequireBehavior;
            o.organizationUsage = organizationUsage;
            o.refreshTokens = refreshTokens;
            o.signingKeys = signingKeys;
            o.sso = sso;
            o.ssoDisabled = ssoDisabled;
            o.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
            o.webOrigins = webOrigins;
            return o;
        }
    }
}
