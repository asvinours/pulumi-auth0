// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ResourceServerScopeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceServerState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerState Empty = new ResourceServerState();

    /**
     * Boolean. Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    @Import(name="allowOfflineAccess")
    private @Nullable Output<Boolean> allowOfflineAccess;

    /**
     * @return Boolean. Indicates whether refresh tokens can be issued for this resource server.
     * 
     */
    public Optional<Output<Boolean>> allowOfflineAccess() {
        return Optional.ofNullable(this.allowOfflineAccess);
    }

    /**
     * Boolean. Indicates whether authorization polices are enforced.
     * 
     */
    @Import(name="enforcePolicies")
    private @Nullable Output<Boolean> enforcePolicies;

    /**
     * @return Boolean. Indicates whether authorization polices are enforced.
     * 
     */
    public Optional<Output<Boolean>> enforcePolicies() {
        return Optional.ofNullable(this.enforcePolicies);
    }

    /**
     * String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * String. Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String. Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Map(String). Used to store additional metadata
     * 
     */
    @Import(name="options")
    private @Nullable Output<Map<String,String>> options;

    /**
     * @return Map(String). Used to store additional metadata
     * 
     */
    public Optional<Output<Map<String,String>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<ResourceServerScopeArgs>> scopes;

    /**
     * @return Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
     * 
     */
    public Optional<Output<List<ResourceServerScopeArgs>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    @Import(name="signingAlg")
    private @Nullable Output<String> signingAlg;

    /**
     * @return String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     * 
     */
    public Optional<Output<String>> signingAlg() {
        return Optional.ofNullable(this.signingAlg);
    }

    /**
     * String. Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    @Import(name="signingSecret")
    private @Nullable Output<String> signingSecret;

    /**
     * @return String. Secret used to sign tokens when using symmetric algorithms (HS256).
     * 
     */
    public Optional<Output<String>> signingSecret() {
        return Optional.ofNullable(this.signingSecret);
    }

    /**
     * Boolean. Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    @Import(name="skipConsentForVerifiableFirstPartyClients")
    private @Nullable Output<Boolean> skipConsentForVerifiableFirstPartyClients;

    /**
     * @return Boolean. Indicates whether to skip user consent for applications flagged as first party.
     * 
     */
    public Optional<Output<Boolean>> skipConsentForVerifiableFirstPartyClients() {
        return Optional.ofNullable(this.skipConsentForVerifiableFirstPartyClients);
    }

    /**
     * String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
     * 
     */
    @Import(name="tokenDialect")
    private @Nullable Output<String> tokenDialect;

    /**
     * @return String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
     * 
     */
    public Optional<Output<String>> tokenDialect() {
        return Optional.ofNullable(this.tokenDialect);
    }

    /**
     * Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    @Import(name="tokenLifetime")
    private @Nullable Output<Integer> tokenLifetime;

    /**
     * @return Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     * 
     */
    public Optional<Output<Integer>> tokenLifetime() {
        return Optional.ofNullable(this.tokenLifetime);
    }

    /**
     * Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    @Import(name="tokenLifetimeForWeb")
    private @Nullable Output<Integer> tokenLifetimeForWeb;

    /**
     * @return Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
     * 
     */
    public Optional<Output<Integer>> tokenLifetimeForWeb() {
        return Optional.ofNullable(this.tokenLifetimeForWeb);
    }

    /**
     * String
     * 
     */
    @Import(name="verificationLocation")
    private @Nullable Output<String> verificationLocation;

    /**
     * @return String
     * 
     */
    public Optional<Output<String>> verificationLocation() {
        return Optional.ofNullable(this.verificationLocation);
    }

    private ResourceServerState() {}

    private ResourceServerState(ResourceServerState $) {
        this.allowOfflineAccess = $.allowOfflineAccess;
        this.enforcePolicies = $.enforcePolicies;
        this.identifier = $.identifier;
        this.name = $.name;
        this.options = $.options;
        this.scopes = $.scopes;
        this.signingAlg = $.signingAlg;
        this.signingSecret = $.signingSecret;
        this.skipConsentForVerifiableFirstPartyClients = $.skipConsentForVerifiableFirstPartyClients;
        this.tokenDialect = $.tokenDialect;
        this.tokenLifetime = $.tokenLifetime;
        this.tokenLifetimeForWeb = $.tokenLifetimeForWeb;
        this.verificationLocation = $.verificationLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerState $;

        public Builder() {
            $ = new ResourceServerState();
        }

        public Builder(ResourceServerState defaults) {
            $ = new ResourceServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowOfflineAccess Boolean. Indicates whether refresh tokens can be issued for this resource server.
         * 
         * @return builder
         * 
         */
        public Builder allowOfflineAccess(@Nullable Output<Boolean> allowOfflineAccess) {
            $.allowOfflineAccess = allowOfflineAccess;
            return this;
        }

        /**
         * @param allowOfflineAccess Boolean. Indicates whether refresh tokens can be issued for this resource server.
         * 
         * @return builder
         * 
         */
        public Builder allowOfflineAccess(Boolean allowOfflineAccess) {
            return allowOfflineAccess(Output.of(allowOfflineAccess));
        }

        /**
         * @param enforcePolicies Boolean. Indicates whether authorization polices are enforced.
         * 
         * @return builder
         * 
         */
        public Builder enforcePolicies(@Nullable Output<Boolean> enforcePolicies) {
            $.enforcePolicies = enforcePolicies;
            return this;
        }

        /**
         * @param enforcePolicies Boolean. Indicates whether authorization polices are enforced.
         * 
         * @return builder
         * 
         */
        public Builder enforcePolicies(Boolean enforcePolicies) {
            return enforcePolicies(Output.of(enforcePolicies));
        }

        /**
         * @param identifier String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name String. Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String. Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param options Map(String). Used to store additional metadata
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Map<String,String>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Map(String). Used to store additional metadata
         * 
         * @return builder
         * 
         */
        public Builder options(Map<String,String> options) {
            return options(Output.of(options));
        }

        /**
         * @param scopes Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<ResourceServerScopeArgs>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<ResourceServerScopeArgs> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
         * 
         * @return builder
         * 
         */
        public Builder scopes(ResourceServerScopeArgs... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param signingAlg String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
         * 
         * @return builder
         * 
         */
        public Builder signingAlg(@Nullable Output<String> signingAlg) {
            $.signingAlg = signingAlg;
            return this;
        }

        /**
         * @param signingAlg String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
         * 
         * @return builder
         * 
         */
        public Builder signingAlg(String signingAlg) {
            return signingAlg(Output.of(signingAlg));
        }

        /**
         * @param signingSecret String. Secret used to sign tokens when using symmetric algorithms (HS256).
         * 
         * @return builder
         * 
         */
        public Builder signingSecret(@Nullable Output<String> signingSecret) {
            $.signingSecret = signingSecret;
            return this;
        }

        /**
         * @param signingSecret String. Secret used to sign tokens when using symmetric algorithms (HS256).
         * 
         * @return builder
         * 
         */
        public Builder signingSecret(String signingSecret) {
            return signingSecret(Output.of(signingSecret));
        }

        /**
         * @param skipConsentForVerifiableFirstPartyClients Boolean. Indicates whether to skip user consent for applications flagged as first party.
         * 
         * @return builder
         * 
         */
        public Builder skipConsentForVerifiableFirstPartyClients(@Nullable Output<Boolean> skipConsentForVerifiableFirstPartyClients) {
            $.skipConsentForVerifiableFirstPartyClients = skipConsentForVerifiableFirstPartyClients;
            return this;
        }

        /**
         * @param skipConsentForVerifiableFirstPartyClients Boolean. Indicates whether to skip user consent for applications flagged as first party.
         * 
         * @return builder
         * 
         */
        public Builder skipConsentForVerifiableFirstPartyClients(Boolean skipConsentForVerifiableFirstPartyClients) {
            return skipConsentForVerifiableFirstPartyClients(Output.of(skipConsentForVerifiableFirstPartyClients));
        }

        /**
         * @param tokenDialect String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
         * 
         * @return builder
         * 
         */
        public Builder tokenDialect(@Nullable Output<String> tokenDialect) {
            $.tokenDialect = tokenDialect;
            return this;
        }

        /**
         * @param tokenDialect String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
         * 
         * @return builder
         * 
         */
        public Builder tokenDialect(String tokenDialect) {
            return tokenDialect(Output.of(tokenDialect));
        }

        /**
         * @param tokenLifetime Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetime(@Nullable Output<Integer> tokenLifetime) {
            $.tokenLifetime = tokenLifetime;
            return this;
        }

        /**
         * @param tokenLifetime Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetime(Integer tokenLifetime) {
            return tokenLifetime(Output.of(tokenLifetime));
        }

        /**
         * @param tokenLifetimeForWeb Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetimeForWeb(@Nullable Output<Integer> tokenLifetimeForWeb) {
            $.tokenLifetimeForWeb = tokenLifetimeForWeb;
            return this;
        }

        /**
         * @param tokenLifetimeForWeb Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
         * 
         * @return builder
         * 
         */
        public Builder tokenLifetimeForWeb(Integer tokenLifetimeForWeb) {
            return tokenLifetimeForWeb(Output.of(tokenLifetimeForWeb));
        }

        /**
         * @param verificationLocation String
         * 
         * @return builder
         * 
         */
        public Builder verificationLocation(@Nullable Output<String> verificationLocation) {
            $.verificationLocation = verificationLocation;
            return this;
        }

        /**
         * @param verificationLocation String
         * 
         * @return builder
         * 
         */
        public Builder verificationLocation(String verificationLocation) {
            return verificationLocation(Output.of(verificationLocation));
        }

        public ResourceServerState build() {
            return $;
        }
    }

}
