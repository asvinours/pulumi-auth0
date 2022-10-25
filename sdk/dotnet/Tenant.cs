// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With this resource, you can manage Auth0 tenants, including setting logos and support contact information, setting error pages, and configuring default tenant behaviors.
    /// 
    /// &gt; Creating tenants through the Management API is not currently supported. Therefore, this resource can only
    /// manage an existing tenant created through the Auth0 dashboard.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myTenant = new Auth0.Tenant("myTenant", new()
    ///     {
    ///         AllowedLogoutUrls = new[]
    ///         {
    ///             "http://example.com/logout",
    ///         },
    ///         ChangePassword = new Auth0.Inputs.TenantChangePasswordArgs
    ///         {
    ///             Enabled = true,
    ///             Html = "&lt;html&gt;Change Password&lt;/html&gt;",
    ///         },
    ///         DefaultRedirectionUri = "https://example.com/login",
    ///         EnabledLocales = new[]
    ///         {
    ///             "en",
    ///         },
    ///         ErrorPage = new Auth0.Inputs.TenantErrorPageArgs
    ///         {
    ///             Html = "&lt;html&gt;Error Page&lt;/html&gt;",
    ///             ShowLogLink = true,
    ///             Url = "https://example.com/errors",
    ///         },
    ///         Flags = new Auth0.Inputs.TenantFlagsArgs
    ///         {
    ///             DisableClickjackProtectionHeaders = true,
    ///             DisableFieldsMapFix = false,
    ///             DisableManagementApiSmsObfuscation = false,
    ///             EnablePublicSignupUserExistsError = true,
    ///             NoDiscloseEnterpriseConnections = false,
    ///             UniversalLogin = true,
    ///             UseScopeDescriptionsForConsent = true,
    ///         },
    ///         FriendlyName = "Tenant Name",
    ///         GuardianMfaPage = new Auth0.Inputs.TenantGuardianMfaPageArgs
    ///         {
    ///             Enabled = true,
    ///             Html = "&lt;html&gt;MFA&lt;/html&gt;",
    ///         },
    ///         PictureUrl = "http://example.com/logo.png",
    ///         SandboxVersion = "12",
    ///         SessionCookie = new Auth0.Inputs.TenantSessionCookieArgs
    ///         {
    ///             Mode = "non-persistent",
    ///         },
    ///         SessionLifetime = 8760,
    ///         SupportEmail = "support@example.com",
    ///         SupportUrl = "http://example.com/support",
    ///         UniversalLogin = new Auth0.Inputs.TenantUniversalLoginArgs
    ///         {
    ///             Colors = new Auth0.Inputs.TenantUniversalLoginColorsArgs
    ///             {
    ///                 PageBackground = "#000000",
    ///                 Primary = "#0059d6",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API, tenant can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/tenant:Tenant my_tenant 82f4f21b-017a-319d-92e7-2291c1ca36c4
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/tenant:Tenant")]
    public partial class Tenant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        [Output("allowedLogoutUrls")]
        public Output<ImmutableArray<string>> AllowedLogoutUrls { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for change password page.
        /// </summary>
        [Output("changePassword")]
        public Output<Outputs.TenantChangePassword> ChangePassword { get; private set; } = null!;

        /// <summary>
        /// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
        /// </summary>
        [Output("defaultAudience")]
        public Output<string> DefaultAudience { get; private set; } = null!;

        /// <summary>
        /// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
        /// </summary>
        [Output("defaultDirectory")]
        public Output<string> DefaultDirectory { get; private set; } = null!;

        /// <summary>
        /// The default absolute redirection URI, must be https and cannot contain a fragment.
        /// </summary>
        [Output("defaultRedirectionUri")]
        public Output<string> DefaultRedirectionUri { get; private set; } = null!;

        /// <summary>
        /// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
        /// </summary>
        [Output("enabledLocales")]
        public Output<ImmutableArray<string>> EnabledLocales { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for error pages.
        /// </summary>
        [Output("errorPage")]
        public Output<Outputs.TenantErrorPage> ErrorPage { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for tenant flags.
        /// </summary>
        [Output("flags")]
        public Output<Outputs.TenantFlags> Flags { get; private set; } = null!;

        /// <summary>
        /// Friendly name for the tenant.
        /// </summary>
        [Output("friendlyName")]
        public Output<string> FriendlyName { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the Guardian MFA page.
        /// </summary>
        [Output("guardianMfaPage")]
        public Output<Outputs.TenantGuardianMfaPage> GuardianMfaPage { get; private set; } = null!;

        /// <summary>
        /// Number of hours during which a session can be inactive before the user must log in again.
        /// </summary>
        [Output("idleSessionLifetime")]
        public Output<double?> IdleSessionLifetime { get; private set; } = null!;

        /// <summary>
        /// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
        /// </summary>
        [Output("pictureUrl")]
        public Output<string> PictureUrl { get; private set; } = null!;

        /// <summary>
        /// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
        /// </summary>
        [Output("sandboxVersion")]
        public Output<string> SandboxVersion { get; private set; } = null!;

        /// <summary>
        /// Alters behavior of tenant's session cookie. Contains a single `mode` property.
        /// </summary>
        [Output("sessionCookie")]
        public Output<Outputs.TenantSessionCookie> SessionCookie { get; private set; } = null!;

        /// <summary>
        /// Number of hours during which a session will stay valid.
        /// </summary>
        [Output("sessionLifetime")]
        public Output<double?> SessionLifetime { get; private set; } = null!;

        /// <summary>
        /// Support email address for authenticating users.
        /// </summary>
        [Output("supportEmail")]
        public Output<string> SupportEmail { get; private set; } = null!;

        /// <summary>
        /// Support URL for authenticating users.
        /// </summary>
        [Output("supportUrl")]
        public Output<string> SupportUrl { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for Universal Login.
        /// </summary>
        [Output("universalLogin")]
        public Output<Outputs.TenantUniversalLogin> UniversalLogin { get; private set; } = null!;


        /// <summary>
        /// Create a Tenant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tenant(string name, TenantArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/tenant:Tenant", name, args ?? new TenantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tenant(string name, Input<string> id, TenantState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/tenant:Tenant", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Tenant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tenant Get(string name, Input<string> id, TenantState? state = null, CustomResourceOptions? options = null)
        {
            return new Tenant(name, id, state, options);
        }
    }

    public sealed class TenantArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedLogoutUrls")]
        private InputList<string>? _allowedLogoutUrls;

        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        public InputList<string> AllowedLogoutUrls
        {
            get => _allowedLogoutUrls ?? (_allowedLogoutUrls = new InputList<string>());
            set => _allowedLogoutUrls = value;
        }

        /// <summary>
        /// Configuration settings for change password page.
        /// </summary>
        [Input("changePassword")]
        public Input<Inputs.TenantChangePasswordArgs>? ChangePassword { get; set; }

        /// <summary>
        /// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
        /// </summary>
        [Input("defaultAudience")]
        public Input<string>? DefaultAudience { get; set; }

        /// <summary>
        /// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
        /// </summary>
        [Input("defaultDirectory")]
        public Input<string>? DefaultDirectory { get; set; }

        /// <summary>
        /// The default absolute redirection URI, must be https and cannot contain a fragment.
        /// </summary>
        [Input("defaultRedirectionUri")]
        public Input<string>? DefaultRedirectionUri { get; set; }

        [Input("enabledLocales")]
        private InputList<string>? _enabledLocales;

        /// <summary>
        /// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
        /// </summary>
        public InputList<string> EnabledLocales
        {
            get => _enabledLocales ?? (_enabledLocales = new InputList<string>());
            set => _enabledLocales = value;
        }

        /// <summary>
        /// Configuration settings for error pages.
        /// </summary>
        [Input("errorPage")]
        public Input<Inputs.TenantErrorPageArgs>? ErrorPage { get; set; }

        /// <summary>
        /// Configuration settings for tenant flags.
        /// </summary>
        [Input("flags")]
        public Input<Inputs.TenantFlagsArgs>? Flags { get; set; }

        /// <summary>
        /// Friendly name for the tenant.
        /// </summary>
        [Input("friendlyName")]
        public Input<string>? FriendlyName { get; set; }

        /// <summary>
        /// Configuration settings for the Guardian MFA page.
        /// </summary>
        [Input("guardianMfaPage")]
        public Input<Inputs.TenantGuardianMfaPageArgs>? GuardianMfaPage { get; set; }

        /// <summary>
        /// Number of hours during which a session can be inactive before the user must log in again.
        /// </summary>
        [Input("idleSessionLifetime")]
        public Input<double>? IdleSessionLifetime { get; set; }

        /// <summary>
        /// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
        /// </summary>
        [Input("pictureUrl")]
        public Input<string>? PictureUrl { get; set; }

        /// <summary>
        /// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
        /// </summary>
        [Input("sandboxVersion")]
        public Input<string>? SandboxVersion { get; set; }

        /// <summary>
        /// Alters behavior of tenant's session cookie. Contains a single `mode` property.
        /// </summary>
        [Input("sessionCookie")]
        public Input<Inputs.TenantSessionCookieArgs>? SessionCookie { get; set; }

        /// <summary>
        /// Number of hours during which a session will stay valid.
        /// </summary>
        [Input("sessionLifetime")]
        public Input<double>? SessionLifetime { get; set; }

        /// <summary>
        /// Support email address for authenticating users.
        /// </summary>
        [Input("supportEmail")]
        public Input<string>? SupportEmail { get; set; }

        /// <summary>
        /// Support URL for authenticating users.
        /// </summary>
        [Input("supportUrl")]
        public Input<string>? SupportUrl { get; set; }

        /// <summary>
        /// Configuration settings for Universal Login.
        /// </summary>
        [Input("universalLogin")]
        public Input<Inputs.TenantUniversalLoginArgs>? UniversalLogin { get; set; }

        public TenantArgs()
        {
        }
        public static new TenantArgs Empty => new TenantArgs();
    }

    public sealed class TenantState : global::Pulumi.ResourceArgs
    {
        [Input("allowedLogoutUrls")]
        private InputList<string>? _allowedLogoutUrls;

        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        public InputList<string> AllowedLogoutUrls
        {
            get => _allowedLogoutUrls ?? (_allowedLogoutUrls = new InputList<string>());
            set => _allowedLogoutUrls = value;
        }

        /// <summary>
        /// Configuration settings for change password page.
        /// </summary>
        [Input("changePassword")]
        public Input<Inputs.TenantChangePasswordGetArgs>? ChangePassword { get; set; }

        /// <summary>
        /// API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
        /// </summary>
        [Input("defaultAudience")]
        public Input<string>? DefaultAudience { get; set; }

        /// <summary>
        /// Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
        /// </summary>
        [Input("defaultDirectory")]
        public Input<string>? DefaultDirectory { get; set; }

        /// <summary>
        /// The default absolute redirection URI, must be https and cannot contain a fragment.
        /// </summary>
        [Input("defaultRedirectionUri")]
        public Input<string>? DefaultRedirectionUri { get; set; }

        [Input("enabledLocales")]
        private InputList<string>? _enabledLocales;

        /// <summary>
        /// Supported locales for the user interface. The first locale in the list will be used to set the default locale.
        /// </summary>
        public InputList<string> EnabledLocales
        {
            get => _enabledLocales ?? (_enabledLocales = new InputList<string>());
            set => _enabledLocales = value;
        }

        /// <summary>
        /// Configuration settings for error pages.
        /// </summary>
        [Input("errorPage")]
        public Input<Inputs.TenantErrorPageGetArgs>? ErrorPage { get; set; }

        /// <summary>
        /// Configuration settings for tenant flags.
        /// </summary>
        [Input("flags")]
        public Input<Inputs.TenantFlagsGetArgs>? Flags { get; set; }

        /// <summary>
        /// Friendly name for the tenant.
        /// </summary>
        [Input("friendlyName")]
        public Input<string>? FriendlyName { get; set; }

        /// <summary>
        /// Configuration settings for the Guardian MFA page.
        /// </summary>
        [Input("guardianMfaPage")]
        public Input<Inputs.TenantGuardianMfaPageGetArgs>? GuardianMfaPage { get; set; }

        /// <summary>
        /// Number of hours during which a session can be inactive before the user must log in again.
        /// </summary>
        [Input("idleSessionLifetime")]
        public Input<double>? IdleSessionLifetime { get; set; }

        /// <summary>
        /// URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
        /// </summary>
        [Input("pictureUrl")]
        public Input<string>? PictureUrl { get; set; }

        /// <summary>
        /// Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
        /// </summary>
        [Input("sandboxVersion")]
        public Input<string>? SandboxVersion { get; set; }

        /// <summary>
        /// Alters behavior of tenant's session cookie. Contains a single `mode` property.
        /// </summary>
        [Input("sessionCookie")]
        public Input<Inputs.TenantSessionCookieGetArgs>? SessionCookie { get; set; }

        /// <summary>
        /// Number of hours during which a session will stay valid.
        /// </summary>
        [Input("sessionLifetime")]
        public Input<double>? SessionLifetime { get; set; }

        /// <summary>
        /// Support email address for authenticating users.
        /// </summary>
        [Input("supportEmail")]
        public Input<string>? SupportEmail { get; set; }

        /// <summary>
        /// Support URL for authenticating users.
        /// </summary>
        [Input("supportUrl")]
        public Input<string>? SupportUrl { get; set; }

        /// <summary>
        /// Configuration settings for Universal Login.
        /// </summary>
        [Input("universalLogin")]
        public Input<Inputs.TenantUniversalLoginGetArgs>? UniversalLogin { get; set; }

        public TenantState()
        {
        }
        public static new TenantState Empty => new TenantState();
    }
}
