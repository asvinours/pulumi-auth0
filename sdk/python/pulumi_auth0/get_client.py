# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetClientResult',
    'AwaitableGetClientResult',
    'get_client',
    'get_client_output',
]

@pulumi.output_type
class GetClientResult:
    """
    A collection of values returned by getClient.
    """
    def __init__(__self__, addons=None, allowed_clients=None, allowed_logout_urls=None, allowed_origins=None, app_type=None, callbacks=None, client_aliases=None, client_id=None, client_metadata=None, client_secret=None, cross_origin_auth=None, cross_origin_loc=None, custom_login_page=None, custom_login_page_on=None, description=None, encryption_key=None, form_template=None, grant_types=None, id=None, initiate_login_uri=None, is_first_party=None, is_token_endpoint_ip_header_trusted=None, jwt_configurations=None, logo_uri=None, mobiles=None, name=None, native_social_logins=None, oidc_backchannel_logout_urls=None, oidc_conformant=None, organization_require_behavior=None, organization_usage=None, refresh_tokens=None, signing_keys=None, sso=None, sso_disabled=None, token_endpoint_auth_method=None, web_origins=None):
        if addons and not isinstance(addons, list):
            raise TypeError("Expected argument 'addons' to be a list")
        pulumi.set(__self__, "addons", addons)
        if allowed_clients and not isinstance(allowed_clients, list):
            raise TypeError("Expected argument 'allowed_clients' to be a list")
        pulumi.set(__self__, "allowed_clients", allowed_clients)
        if allowed_logout_urls and not isinstance(allowed_logout_urls, list):
            raise TypeError("Expected argument 'allowed_logout_urls' to be a list")
        pulumi.set(__self__, "allowed_logout_urls", allowed_logout_urls)
        if allowed_origins and not isinstance(allowed_origins, list):
            raise TypeError("Expected argument 'allowed_origins' to be a list")
        pulumi.set(__self__, "allowed_origins", allowed_origins)
        if app_type and not isinstance(app_type, str):
            raise TypeError("Expected argument 'app_type' to be a str")
        pulumi.set(__self__, "app_type", app_type)
        if callbacks and not isinstance(callbacks, list):
            raise TypeError("Expected argument 'callbacks' to be a list")
        pulumi.set(__self__, "callbacks", callbacks)
        if client_aliases and not isinstance(client_aliases, list):
            raise TypeError("Expected argument 'client_aliases' to be a list")
        pulumi.set(__self__, "client_aliases", client_aliases)
        if client_id and not isinstance(client_id, str):
            raise TypeError("Expected argument 'client_id' to be a str")
        pulumi.set(__self__, "client_id", client_id)
        if client_metadata and not isinstance(client_metadata, dict):
            raise TypeError("Expected argument 'client_metadata' to be a dict")
        pulumi.set(__self__, "client_metadata", client_metadata)
        if client_secret and not isinstance(client_secret, str):
            raise TypeError("Expected argument 'client_secret' to be a str")
        pulumi.set(__self__, "client_secret", client_secret)
        if cross_origin_auth and not isinstance(cross_origin_auth, bool):
            raise TypeError("Expected argument 'cross_origin_auth' to be a bool")
        pulumi.set(__self__, "cross_origin_auth", cross_origin_auth)
        if cross_origin_loc and not isinstance(cross_origin_loc, str):
            raise TypeError("Expected argument 'cross_origin_loc' to be a str")
        pulumi.set(__self__, "cross_origin_loc", cross_origin_loc)
        if custom_login_page and not isinstance(custom_login_page, str):
            raise TypeError("Expected argument 'custom_login_page' to be a str")
        pulumi.set(__self__, "custom_login_page", custom_login_page)
        if custom_login_page_on and not isinstance(custom_login_page_on, bool):
            raise TypeError("Expected argument 'custom_login_page_on' to be a bool")
        pulumi.set(__self__, "custom_login_page_on", custom_login_page_on)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if encryption_key and not isinstance(encryption_key, dict):
            raise TypeError("Expected argument 'encryption_key' to be a dict")
        pulumi.set(__self__, "encryption_key", encryption_key)
        if form_template and not isinstance(form_template, str):
            raise TypeError("Expected argument 'form_template' to be a str")
        pulumi.set(__self__, "form_template", form_template)
        if grant_types and not isinstance(grant_types, list):
            raise TypeError("Expected argument 'grant_types' to be a list")
        pulumi.set(__self__, "grant_types", grant_types)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if initiate_login_uri and not isinstance(initiate_login_uri, str):
            raise TypeError("Expected argument 'initiate_login_uri' to be a str")
        pulumi.set(__self__, "initiate_login_uri", initiate_login_uri)
        if is_first_party and not isinstance(is_first_party, bool):
            raise TypeError("Expected argument 'is_first_party' to be a bool")
        pulumi.set(__self__, "is_first_party", is_first_party)
        if is_token_endpoint_ip_header_trusted and not isinstance(is_token_endpoint_ip_header_trusted, bool):
            raise TypeError("Expected argument 'is_token_endpoint_ip_header_trusted' to be a bool")
        pulumi.set(__self__, "is_token_endpoint_ip_header_trusted", is_token_endpoint_ip_header_trusted)
        if jwt_configurations and not isinstance(jwt_configurations, list):
            raise TypeError("Expected argument 'jwt_configurations' to be a list")
        pulumi.set(__self__, "jwt_configurations", jwt_configurations)
        if logo_uri and not isinstance(logo_uri, str):
            raise TypeError("Expected argument 'logo_uri' to be a str")
        pulumi.set(__self__, "logo_uri", logo_uri)
        if mobiles and not isinstance(mobiles, list):
            raise TypeError("Expected argument 'mobiles' to be a list")
        pulumi.set(__self__, "mobiles", mobiles)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if native_social_logins and not isinstance(native_social_logins, list):
            raise TypeError("Expected argument 'native_social_logins' to be a list")
        pulumi.set(__self__, "native_social_logins", native_social_logins)
        if oidc_backchannel_logout_urls and not isinstance(oidc_backchannel_logout_urls, list):
            raise TypeError("Expected argument 'oidc_backchannel_logout_urls' to be a list")
        pulumi.set(__self__, "oidc_backchannel_logout_urls", oidc_backchannel_logout_urls)
        if oidc_conformant and not isinstance(oidc_conformant, bool):
            raise TypeError("Expected argument 'oidc_conformant' to be a bool")
        pulumi.set(__self__, "oidc_conformant", oidc_conformant)
        if organization_require_behavior and not isinstance(organization_require_behavior, str):
            raise TypeError("Expected argument 'organization_require_behavior' to be a str")
        pulumi.set(__self__, "organization_require_behavior", organization_require_behavior)
        if organization_usage and not isinstance(organization_usage, str):
            raise TypeError("Expected argument 'organization_usage' to be a str")
        pulumi.set(__self__, "organization_usage", organization_usage)
        if refresh_tokens and not isinstance(refresh_tokens, list):
            raise TypeError("Expected argument 'refresh_tokens' to be a list")
        pulumi.set(__self__, "refresh_tokens", refresh_tokens)
        if signing_keys and not isinstance(signing_keys, list):
            raise TypeError("Expected argument 'signing_keys' to be a list")
        pulumi.set(__self__, "signing_keys", signing_keys)
        if sso and not isinstance(sso, bool):
            raise TypeError("Expected argument 'sso' to be a bool")
        pulumi.set(__self__, "sso", sso)
        if sso_disabled and not isinstance(sso_disabled, bool):
            raise TypeError("Expected argument 'sso_disabled' to be a bool")
        pulumi.set(__self__, "sso_disabled", sso_disabled)
        if token_endpoint_auth_method and not isinstance(token_endpoint_auth_method, str):
            raise TypeError("Expected argument 'token_endpoint_auth_method' to be a str")
        pulumi.set(__self__, "token_endpoint_auth_method", token_endpoint_auth_method)
        if web_origins and not isinstance(web_origins, list):
            raise TypeError("Expected argument 'web_origins' to be a list")
        pulumi.set(__self__, "web_origins", web_origins)

    @property
    @pulumi.getter
    def addons(self) -> Sequence['outputs.GetClientAddonResult']:
        """
        Addons enabled for this client and their associated configurations.
        """
        return pulumi.get(self, "addons")

    @property
    @pulumi.getter(name="allowedClients")
    def allowed_clients(self) -> Sequence[str]:
        """
        List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
        """
        return pulumi.get(self, "allowed_clients")

    @property
    @pulumi.getter(name="allowedLogoutUrls")
    def allowed_logout_urls(self) -> Sequence[str]:
        """
        URLs that Auth0 may redirect to after logout.
        """
        return pulumi.get(self, "allowed_logout_urls")

    @property
    @pulumi.getter(name="allowedOrigins")
    def allowed_origins(self) -> Sequence[str]:
        """
        URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
        """
        return pulumi.get(self, "allowed_origins")

    @property
    @pulumi.getter(name="appType")
    def app_type(self) -> str:
        """
        Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
        """
        return pulumi.get(self, "app_type")

    @property
    @pulumi.getter
    def callbacks(self) -> Sequence[str]:
        """
        URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
        """
        return pulumi.get(self, "callbacks")

    @property
    @pulumi.getter(name="clientAliases")
    def client_aliases(self) -> Sequence[str]:
        """
        List of audiences/realms for SAML protocol. Used by the wsfed addon.
        """
        return pulumi.get(self, "client_aliases")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[str]:
        """
        The ID of the client. If not provided, `name` must be set.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientMetadata")
    def client_metadata(self) -> Mapping[str, Any]:
        """
        Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\\()<>@ [Tab] [Space]`.
        """
        return pulumi.get(self, "client_metadata")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> str:
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter(name="crossOriginAuth")
    def cross_origin_auth(self) -> bool:
        """
        Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
        """
        return pulumi.get(self, "cross_origin_auth")

    @property
    @pulumi.getter(name="crossOriginLoc")
    def cross_origin_loc(self) -> str:
        """
        URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
        """
        return pulumi.get(self, "cross_origin_loc")

    @property
    @pulumi.getter(name="customLoginPage")
    def custom_login_page(self) -> str:
        """
        The content (HTML, CSS, JS) of the custom login page.
        """
        return pulumi.get(self, "custom_login_page")

    @property
    @pulumi.getter(name="customLoginPageOn")
    def custom_login_page_on(self) -> bool:
        """
        Indicates whether a custom login page is to be used.
        """
        return pulumi.get(self, "custom_login_page_on")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the purpose of the client.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="encryptionKey")
    def encryption_key(self) -> Mapping[str, str]:
        """
        Encryption used for WS-Fed responses with this client.
        """
        return pulumi.get(self, "encryption_key")

    @property
    @pulumi.getter(name="formTemplate")
    def form_template(self) -> str:
        """
        HTML form template to be used for WS-Federation.
        """
        return pulumi.get(self, "form_template")

    @property
    @pulumi.getter(name="grantTypes")
    def grant_types(self) -> Sequence[str]:
        """
        Types of grants that this client is authorized to use.
        """
        return pulumi.get(self, "grant_types")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="initiateLoginUri")
    def initiate_login_uri(self) -> str:
        """
        Initiate login URI. Must be HTTPS or an empty string.
        """
        return pulumi.get(self, "initiate_login_uri")

    @property
    @pulumi.getter(name="isFirstParty")
    def is_first_party(self) -> bool:
        """
        Indicates whether this client is a first-party client.
        """
        return pulumi.get(self, "is_first_party")

    @property
    @pulumi.getter(name="isTokenEndpointIpHeaderTrusted")
    def is_token_endpoint_ip_header_trusted(self) -> bool:
        """
        Indicates whether the token endpoint IP header is trusted.
        """
        return pulumi.get(self, "is_token_endpoint_ip_header_trusted")

    @property
    @pulumi.getter(name="jwtConfigurations")
    def jwt_configurations(self) -> Sequence['outputs.GetClientJwtConfigurationResult']:
        """
        Configuration settings for the JWTs issued for this client.
        """
        return pulumi.get(self, "jwt_configurations")

    @property
    @pulumi.getter(name="logoUri")
    def logo_uri(self) -> str:
        """
        URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
        """
        return pulumi.get(self, "logo_uri")

    @property
    @pulumi.getter
    def mobiles(self) -> Sequence['outputs.GetClientMobileResult']:
        """
        Additional configuration for native mobile apps.
        """
        return pulumi.get(self, "mobiles")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the client. If not provided, `client_id` must be set.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nativeSocialLogins")
    def native_social_logins(self) -> Sequence['outputs.GetClientNativeSocialLoginResult']:
        """
        Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
        """
        return pulumi.get(self, "native_social_logins")

    @property
    @pulumi.getter(name="oidcBackchannelLogoutUrls")
    def oidc_backchannel_logout_urls(self) -> Sequence[str]:
        """
        Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
        """
        return pulumi.get(self, "oidc_backchannel_logout_urls")

    @property
    @pulumi.getter(name="oidcConformant")
    def oidc_conformant(self) -> bool:
        """
        Indicates whether this client will conform to strict OIDC specifications.
        """
        return pulumi.get(self, "oidc_conformant")

    @property
    @pulumi.getter(name="organizationRequireBehavior")
    def organization_require_behavior(self) -> str:
        """
        Defines how to proceed during an authentication transaction when `organization_usage = "require"`. Can be `no_prompt` (default) or `pre_login_prompt`.
        """
        return pulumi.get(self, "organization_require_behavior")

    @property
    @pulumi.getter(name="organizationUsage")
    def organization_usage(self) -> str:
        """
        Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
        """
        return pulumi.get(self, "organization_usage")

    @property
    @pulumi.getter(name="refreshTokens")
    def refresh_tokens(self) -> Sequence['outputs.GetClientRefreshTokenResult']:
        """
        Configuration settings for the refresh tokens issued for this client.
        """
        return pulumi.get(self, "refresh_tokens")

    @property
    @pulumi.getter(name="signingKeys")
    def signing_keys(self) -> Sequence[Mapping[str, Any]]:
        """
        List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
        """
        return pulumi.get(self, "signing_keys")

    @property
    @pulumi.getter
    def sso(self) -> bool:
        """
        Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
        """
        return pulumi.get(self, "sso")

    @property
    @pulumi.getter(name="ssoDisabled")
    def sso_disabled(self) -> bool:
        """
        Indicates whether or not SSO is disabled.
        """
        return pulumi.get(self, "sso_disabled")

    @property
    @pulumi.getter(name="tokenEndpointAuthMethod")
    def token_endpoint_auth_method(self) -> str:
        """
        Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
        """
        return pulumi.get(self, "token_endpoint_auth_method")

    @property
    @pulumi.getter(name="webOrigins")
    def web_origins(self) -> Sequence[str]:
        """
        URLs that represent valid web origins for use with web message response mode.
        """
        return pulumi.get(self, "web_origins")


class AwaitableGetClientResult(GetClientResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClientResult(
            addons=self.addons,
            allowed_clients=self.allowed_clients,
            allowed_logout_urls=self.allowed_logout_urls,
            allowed_origins=self.allowed_origins,
            app_type=self.app_type,
            callbacks=self.callbacks,
            client_aliases=self.client_aliases,
            client_id=self.client_id,
            client_metadata=self.client_metadata,
            client_secret=self.client_secret,
            cross_origin_auth=self.cross_origin_auth,
            cross_origin_loc=self.cross_origin_loc,
            custom_login_page=self.custom_login_page,
            custom_login_page_on=self.custom_login_page_on,
            description=self.description,
            encryption_key=self.encryption_key,
            form_template=self.form_template,
            grant_types=self.grant_types,
            id=self.id,
            initiate_login_uri=self.initiate_login_uri,
            is_first_party=self.is_first_party,
            is_token_endpoint_ip_header_trusted=self.is_token_endpoint_ip_header_trusted,
            jwt_configurations=self.jwt_configurations,
            logo_uri=self.logo_uri,
            mobiles=self.mobiles,
            name=self.name,
            native_social_logins=self.native_social_logins,
            oidc_backchannel_logout_urls=self.oidc_backchannel_logout_urls,
            oidc_conformant=self.oidc_conformant,
            organization_require_behavior=self.organization_require_behavior,
            organization_usage=self.organization_usage,
            refresh_tokens=self.refresh_tokens,
            signing_keys=self.signing_keys,
            sso=self.sso,
            sso_disabled=self.sso_disabled,
            token_endpoint_auth_method=self.token_endpoint_auth_method,
            web_origins=self.web_origins)


def get_client(client_id: Optional[str] = None,
               name: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClientResult:
    """
    Data source to retrieve a specific Auth0 application client by `client_id` or `name`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    some_client_by_name = auth0.get_client(name="Name of my Application")
    some_client_by_id = auth0.get_client(client_id="abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param str client_id: The ID of the client. If not provided, `name` must be set.
    :param str name: The name of the client. If not provided, `client_id` must be set.
    """
    __args__ = dict()
    __args__['clientId'] = client_id
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getClient:getClient', __args__, opts=opts, typ=GetClientResult).value

    return AwaitableGetClientResult(
        addons=__ret__.addons,
        allowed_clients=__ret__.allowed_clients,
        allowed_logout_urls=__ret__.allowed_logout_urls,
        allowed_origins=__ret__.allowed_origins,
        app_type=__ret__.app_type,
        callbacks=__ret__.callbacks,
        client_aliases=__ret__.client_aliases,
        client_id=__ret__.client_id,
        client_metadata=__ret__.client_metadata,
        client_secret=__ret__.client_secret,
        cross_origin_auth=__ret__.cross_origin_auth,
        cross_origin_loc=__ret__.cross_origin_loc,
        custom_login_page=__ret__.custom_login_page,
        custom_login_page_on=__ret__.custom_login_page_on,
        description=__ret__.description,
        encryption_key=__ret__.encryption_key,
        form_template=__ret__.form_template,
        grant_types=__ret__.grant_types,
        id=__ret__.id,
        initiate_login_uri=__ret__.initiate_login_uri,
        is_first_party=__ret__.is_first_party,
        is_token_endpoint_ip_header_trusted=__ret__.is_token_endpoint_ip_header_trusted,
        jwt_configurations=__ret__.jwt_configurations,
        logo_uri=__ret__.logo_uri,
        mobiles=__ret__.mobiles,
        name=__ret__.name,
        native_social_logins=__ret__.native_social_logins,
        oidc_backchannel_logout_urls=__ret__.oidc_backchannel_logout_urls,
        oidc_conformant=__ret__.oidc_conformant,
        organization_require_behavior=__ret__.organization_require_behavior,
        organization_usage=__ret__.organization_usage,
        refresh_tokens=__ret__.refresh_tokens,
        signing_keys=__ret__.signing_keys,
        sso=__ret__.sso,
        sso_disabled=__ret__.sso_disabled,
        token_endpoint_auth_method=__ret__.token_endpoint_auth_method,
        web_origins=__ret__.web_origins)


@_utilities.lift_output_func(get_client)
def get_client_output(client_id: Optional[pulumi.Input[Optional[str]]] = None,
                      name: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClientResult]:
    """
    Data source to retrieve a specific Auth0 application client by `client_id` or `name`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    some_client_by_name = auth0.get_client(name="Name of my Application")
    some_client_by_id = auth0.get_client(client_id="abcdefghkijklmnopqrstuvwxyz0123456789")
    ```


    :param str client_id: The ID of the client. If not provided, `name` must be set.
    :param str name: The name of the client. If not provided, `client_id` must be set.
    """
    ...
