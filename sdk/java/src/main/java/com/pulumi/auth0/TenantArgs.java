// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.inputs.TenantChangePasswordArgs;
import com.pulumi.auth0.inputs.TenantErrorPageArgs;
import com.pulumi.auth0.inputs.TenantFlagsArgs;
import com.pulumi.auth0.inputs.TenantGuardianMfaPageArgs;
import com.pulumi.auth0.inputs.TenantSessionCookieArgs;
import com.pulumi.auth0.inputs.TenantUniversalLoginArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TenantArgs extends com.pulumi.resources.ResourceArgs {

    public static final TenantArgs Empty = new TenantArgs();

    /**
     * URLs that Auth0 may redirect to after logout.
     * 
     */
    @Import(name="allowedLogoutUrls")
    private @Nullable Output<List<String>> allowedLogoutUrls;

    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    public Optional<Output<List<String>>> allowedLogoutUrls() {
        return Optional.ofNullable(this.allowedLogoutUrls);
    }

    /**
     * Configuration settings for change password page.
     * 
     */
    @Import(name="changePassword")
    private @Nullable Output<TenantChangePasswordArgs> changePassword;

    /**
     * @return Configuration settings for change password page.
     * 
     */
    public Optional<Output<TenantChangePasswordArgs>> changePassword() {
        return Optional.ofNullable(this.changePassword);
    }

    /**
     * API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     * 
     */
    @Import(name="defaultAudience")
    private @Nullable Output<String> defaultAudience;

    /**
     * @return API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     * 
     */
    public Optional<Output<String>> defaultAudience() {
        return Optional.ofNullable(this.defaultAudience);
    }

    /**
     * Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     * 
     */
    @Import(name="defaultDirectory")
    private @Nullable Output<String> defaultDirectory;

    /**
     * @return Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     * 
     */
    public Optional<Output<String>> defaultDirectory() {
        return Optional.ofNullable(this.defaultDirectory);
    }

    /**
     * The default absolute redirection URI, must be https and cannot contain a fragment.
     * 
     */
    @Import(name="defaultRedirectionUri")
    private @Nullable Output<String> defaultRedirectionUri;

    /**
     * @return The default absolute redirection URI, must be https and cannot contain a fragment.
     * 
     */
    public Optional<Output<String>> defaultRedirectionUri() {
        return Optional.ofNullable(this.defaultRedirectionUri);
    }

    /**
     * Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     * 
     */
    @Import(name="enabledLocales")
    private @Nullable Output<List<String>> enabledLocales;

    /**
     * @return Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     * 
     */
    public Optional<Output<List<String>>> enabledLocales() {
        return Optional.ofNullable(this.enabledLocales);
    }

    /**
     * Configuration settings for error pages.
     * 
     */
    @Import(name="errorPage")
    private @Nullable Output<TenantErrorPageArgs> errorPage;

    /**
     * @return Configuration settings for error pages.
     * 
     */
    public Optional<Output<TenantErrorPageArgs>> errorPage() {
        return Optional.ofNullable(this.errorPage);
    }

    /**
     * Configuration settings for tenant flags.
     * 
     */
    @Import(name="flags")
    private @Nullable Output<TenantFlagsArgs> flags;

    /**
     * @return Configuration settings for tenant flags.
     * 
     */
    public Optional<Output<TenantFlagsArgs>> flags() {
        return Optional.ofNullable(this.flags);
    }

    /**
     * Friendly name for the tenant.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Friendly name for the tenant.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Configuration settings for the Guardian MFA page.
     * 
     */
    @Import(name="guardianMfaPage")
    private @Nullable Output<TenantGuardianMfaPageArgs> guardianMfaPage;

    /**
     * @return Configuration settings for the Guardian MFA page.
     * 
     */
    public Optional<Output<TenantGuardianMfaPageArgs>> guardianMfaPage() {
        return Optional.ofNullable(this.guardianMfaPage);
    }

    /**
     * Number of hours during which a session can be inactive before the user must log in again.
     * 
     */
    @Import(name="idleSessionLifetime")
    private @Nullable Output<Double> idleSessionLifetime;

    /**
     * @return Number of hours during which a session can be inactive before the user must log in again.
     * 
     */
    public Optional<Output<Double>> idleSessionLifetime() {
        return Optional.ofNullable(this.idleSessionLifetime);
    }

    /**
     * URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     * 
     */
    @Import(name="pictureUrl")
    private @Nullable Output<String> pictureUrl;

    /**
     * @return URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     * 
     */
    public Optional<Output<String>> pictureUrl() {
        return Optional.ofNullable(this.pictureUrl);
    }

    /**
     * Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
     * 
     */
    @Import(name="sandboxVersion")
    private @Nullable Output<String> sandboxVersion;

    /**
     * @return Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
     * 
     */
    public Optional<Output<String>> sandboxVersion() {
        return Optional.ofNullable(this.sandboxVersion);
    }

    /**
     * Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
     * 
     */
    @Import(name="sessionCookie")
    private @Nullable Output<TenantSessionCookieArgs> sessionCookie;

    /**
     * @return Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
     * 
     */
    public Optional<Output<TenantSessionCookieArgs>> sessionCookie() {
        return Optional.ofNullable(this.sessionCookie);
    }

    /**
     * Number of hours during which a session will stay valid.
     * 
     */
    @Import(name="sessionLifetime")
    private @Nullable Output<Double> sessionLifetime;

    /**
     * @return Number of hours during which a session will stay valid.
     * 
     */
    public Optional<Output<Double>> sessionLifetime() {
        return Optional.ofNullable(this.sessionLifetime);
    }

    /**
     * Support email address for authenticating users.
     * 
     */
    @Import(name="supportEmail")
    private @Nullable Output<String> supportEmail;

    /**
     * @return Support email address for authenticating users.
     * 
     */
    public Optional<Output<String>> supportEmail() {
        return Optional.ofNullable(this.supportEmail);
    }

    /**
     * Support URL for authenticating users.
     * 
     */
    @Import(name="supportUrl")
    private @Nullable Output<String> supportUrl;

    /**
     * @return Support URL for authenticating users.
     * 
     */
    public Optional<Output<String>> supportUrl() {
        return Optional.ofNullable(this.supportUrl);
    }

    /**
     * Configuration settings for Universal Login.
     * 
     */
    @Import(name="universalLogin")
    private @Nullable Output<TenantUniversalLoginArgs> universalLogin;

    /**
     * @return Configuration settings for Universal Login.
     * 
     */
    public Optional<Output<TenantUniversalLoginArgs>> universalLogin() {
        return Optional.ofNullable(this.universalLogin);
    }

    private TenantArgs() {}

    private TenantArgs(TenantArgs $) {
        this.allowedLogoutUrls = $.allowedLogoutUrls;
        this.changePassword = $.changePassword;
        this.defaultAudience = $.defaultAudience;
        this.defaultDirectory = $.defaultDirectory;
        this.defaultRedirectionUri = $.defaultRedirectionUri;
        this.enabledLocales = $.enabledLocales;
        this.errorPage = $.errorPage;
        this.flags = $.flags;
        this.friendlyName = $.friendlyName;
        this.guardianMfaPage = $.guardianMfaPage;
        this.idleSessionLifetime = $.idleSessionLifetime;
        this.pictureUrl = $.pictureUrl;
        this.sandboxVersion = $.sandboxVersion;
        this.sessionCookie = $.sessionCookie;
        this.sessionLifetime = $.sessionLifetime;
        this.supportEmail = $.supportEmail;
        this.supportUrl = $.supportUrl;
        this.universalLogin = $.universalLogin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TenantArgs $;

        public Builder() {
            $ = new TenantArgs();
        }

        public Builder(TenantArgs defaults) {
            $ = new TenantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedLogoutUrls URLs that Auth0 may redirect to after logout.
         * 
         * @return builder
         * 
         */
        public Builder allowedLogoutUrls(@Nullable Output<List<String>> allowedLogoutUrls) {
            $.allowedLogoutUrls = allowedLogoutUrls;
            return this;
        }

        /**
         * @param allowedLogoutUrls URLs that Auth0 may redirect to after logout.
         * 
         * @return builder
         * 
         */
        public Builder allowedLogoutUrls(List<String> allowedLogoutUrls) {
            return allowedLogoutUrls(Output.of(allowedLogoutUrls));
        }

        /**
         * @param allowedLogoutUrls URLs that Auth0 may redirect to after logout.
         * 
         * @return builder
         * 
         */
        public Builder allowedLogoutUrls(String... allowedLogoutUrls) {
            return allowedLogoutUrls(List.of(allowedLogoutUrls));
        }

        /**
         * @param changePassword Configuration settings for change password page.
         * 
         * @return builder
         * 
         */
        public Builder changePassword(@Nullable Output<TenantChangePasswordArgs> changePassword) {
            $.changePassword = changePassword;
            return this;
        }

        /**
         * @param changePassword Configuration settings for change password page.
         * 
         * @return builder
         * 
         */
        public Builder changePassword(TenantChangePasswordArgs changePassword) {
            return changePassword(Output.of(changePassword));
        }

        /**
         * @param defaultAudience API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
         * 
         * @return builder
         * 
         */
        public Builder defaultAudience(@Nullable Output<String> defaultAudience) {
            $.defaultAudience = defaultAudience;
            return this;
        }

        /**
         * @param defaultAudience API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
         * 
         * @return builder
         * 
         */
        public Builder defaultAudience(String defaultAudience) {
            return defaultAudience(Output.of(defaultAudience));
        }

        /**
         * @param defaultDirectory Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
         * 
         * @return builder
         * 
         */
        public Builder defaultDirectory(@Nullable Output<String> defaultDirectory) {
            $.defaultDirectory = defaultDirectory;
            return this;
        }

        /**
         * @param defaultDirectory Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
         * 
         * @return builder
         * 
         */
        public Builder defaultDirectory(String defaultDirectory) {
            return defaultDirectory(Output.of(defaultDirectory));
        }

        /**
         * @param defaultRedirectionUri The default absolute redirection URI, must be https and cannot contain a fragment.
         * 
         * @return builder
         * 
         */
        public Builder defaultRedirectionUri(@Nullable Output<String> defaultRedirectionUri) {
            $.defaultRedirectionUri = defaultRedirectionUri;
            return this;
        }

        /**
         * @param defaultRedirectionUri The default absolute redirection URI, must be https and cannot contain a fragment.
         * 
         * @return builder
         * 
         */
        public Builder defaultRedirectionUri(String defaultRedirectionUri) {
            return defaultRedirectionUri(Output.of(defaultRedirectionUri));
        }

        /**
         * @param enabledLocales Supported locales for the user interface. The first locale in the list will be used to set the default locale.
         * 
         * @return builder
         * 
         */
        public Builder enabledLocales(@Nullable Output<List<String>> enabledLocales) {
            $.enabledLocales = enabledLocales;
            return this;
        }

        /**
         * @param enabledLocales Supported locales for the user interface. The first locale in the list will be used to set the default locale.
         * 
         * @return builder
         * 
         */
        public Builder enabledLocales(List<String> enabledLocales) {
            return enabledLocales(Output.of(enabledLocales));
        }

        /**
         * @param enabledLocales Supported locales for the user interface. The first locale in the list will be used to set the default locale.
         * 
         * @return builder
         * 
         */
        public Builder enabledLocales(String... enabledLocales) {
            return enabledLocales(List.of(enabledLocales));
        }

        /**
         * @param errorPage Configuration settings for error pages.
         * 
         * @return builder
         * 
         */
        public Builder errorPage(@Nullable Output<TenantErrorPageArgs> errorPage) {
            $.errorPage = errorPage;
            return this;
        }

        /**
         * @param errorPage Configuration settings for error pages.
         * 
         * @return builder
         * 
         */
        public Builder errorPage(TenantErrorPageArgs errorPage) {
            return errorPage(Output.of(errorPage));
        }

        /**
         * @param flags Configuration settings for tenant flags.
         * 
         * @return builder
         * 
         */
        public Builder flags(@Nullable Output<TenantFlagsArgs> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags Configuration settings for tenant flags.
         * 
         * @return builder
         * 
         */
        public Builder flags(TenantFlagsArgs flags) {
            return flags(Output.of(flags));
        }

        /**
         * @param friendlyName Friendly name for the tenant.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Friendly name for the tenant.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param guardianMfaPage Configuration settings for the Guardian MFA page.
         * 
         * @return builder
         * 
         */
        public Builder guardianMfaPage(@Nullable Output<TenantGuardianMfaPageArgs> guardianMfaPage) {
            $.guardianMfaPage = guardianMfaPage;
            return this;
        }

        /**
         * @param guardianMfaPage Configuration settings for the Guardian MFA page.
         * 
         * @return builder
         * 
         */
        public Builder guardianMfaPage(TenantGuardianMfaPageArgs guardianMfaPage) {
            return guardianMfaPage(Output.of(guardianMfaPage));
        }

        /**
         * @param idleSessionLifetime Number of hours during which a session can be inactive before the user must log in again.
         * 
         * @return builder
         * 
         */
        public Builder idleSessionLifetime(@Nullable Output<Double> idleSessionLifetime) {
            $.idleSessionLifetime = idleSessionLifetime;
            return this;
        }

        /**
         * @param idleSessionLifetime Number of hours during which a session can be inactive before the user must log in again.
         * 
         * @return builder
         * 
         */
        public Builder idleSessionLifetime(Double idleSessionLifetime) {
            return idleSessionLifetime(Output.of(idleSessionLifetime));
        }

        /**
         * @param pictureUrl URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
         * 
         * @return builder
         * 
         */
        public Builder pictureUrl(@Nullable Output<String> pictureUrl) {
            $.pictureUrl = pictureUrl;
            return this;
        }

        /**
         * @param pictureUrl URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
         * 
         * @return builder
         * 
         */
        public Builder pictureUrl(String pictureUrl) {
            return pictureUrl(Output.of(pictureUrl));
        }

        /**
         * @param sandboxVersion Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
         * 
         * @return builder
         * 
         */
        public Builder sandboxVersion(@Nullable Output<String> sandboxVersion) {
            $.sandboxVersion = sandboxVersion;
            return this;
        }

        /**
         * @param sandboxVersion Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0&#39;s functionality.
         * 
         * @return builder
         * 
         */
        public Builder sandboxVersion(String sandboxVersion) {
            return sandboxVersion(Output.of(sandboxVersion));
        }

        /**
         * @param sessionCookie Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
         * 
         * @return builder
         * 
         */
        public Builder sessionCookie(@Nullable Output<TenantSessionCookieArgs> sessionCookie) {
            $.sessionCookie = sessionCookie;
            return this;
        }

        /**
         * @param sessionCookie Alters behavior of tenant&#39;s session cookie. Contains a single `mode` property.
         * 
         * @return builder
         * 
         */
        public Builder sessionCookie(TenantSessionCookieArgs sessionCookie) {
            return sessionCookie(Output.of(sessionCookie));
        }

        /**
         * @param sessionLifetime Number of hours during which a session will stay valid.
         * 
         * @return builder
         * 
         */
        public Builder sessionLifetime(@Nullable Output<Double> sessionLifetime) {
            $.sessionLifetime = sessionLifetime;
            return this;
        }

        /**
         * @param sessionLifetime Number of hours during which a session will stay valid.
         * 
         * @return builder
         * 
         */
        public Builder sessionLifetime(Double sessionLifetime) {
            return sessionLifetime(Output.of(sessionLifetime));
        }

        /**
         * @param supportEmail Support email address for authenticating users.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(@Nullable Output<String> supportEmail) {
            $.supportEmail = supportEmail;
            return this;
        }

        /**
         * @param supportEmail Support email address for authenticating users.
         * 
         * @return builder
         * 
         */
        public Builder supportEmail(String supportEmail) {
            return supportEmail(Output.of(supportEmail));
        }

        /**
         * @param supportUrl Support URL for authenticating users.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(@Nullable Output<String> supportUrl) {
            $.supportUrl = supportUrl;
            return this;
        }

        /**
         * @param supportUrl Support URL for authenticating users.
         * 
         * @return builder
         * 
         */
        public Builder supportUrl(String supportUrl) {
            return supportUrl(Output.of(supportUrl));
        }

        /**
         * @param universalLogin Configuration settings for Universal Login.
         * 
         * @return builder
         * 
         */
        public Builder universalLogin(@Nullable Output<TenantUniversalLoginArgs> universalLogin) {
            $.universalLogin = universalLogin;
            return this;
        }

        /**
         * @param universalLogin Configuration settings for Universal Login.
         * 
         * @return builder
         * 
         */
        public Builder universalLogin(TenantUniversalLoginArgs universalLogin) {
            return universalLogin(Output.of(universalLogin));
        }

        public TenantArgs build() {
            return $;
        }
    }

}
