// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface ClientAddons {
    /**
     * String
     */
    aws?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    azureBlob?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    azureSb?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    box?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    cloudbees?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    concur?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    dropbox?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    echosign?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    egnyte?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    firebase?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    layer?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    mscrm?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    newrelic?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    office365?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    rms?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    salesforce?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    salesforceApi?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    salesforceSandboxApi?: pulumi.Input<{[key: string]: any}>;
    /**
     * List(Resource). Configuration settings for a SAML add-on. For details, see SAML.
     */
    samlp?: pulumi.Input<inputs.ClientAddonsSamlp>;
    /**
     * String
     */
    sapApi?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    sentry?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    sharepoint?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    slack?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    springcm?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    wams?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    wsfed?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    zendesk?: pulumi.Input<{[key: string]: any}>;
    /**
     * String
     */
    zoom?: pulumi.Input<{[key: string]: any}>;
}

export interface ClientAddonsSamlp {
    /**
     * String. Audience of the SAML Assertion. Default will be the Issuer on SAMLRequest.
     */
    audience?: pulumi.Input<string>;
    /**
     * String. Class reference of the authentication context.
     */
    authnContextClassRef?: pulumi.Input<string>;
    /**
     * String. Protocol binding used for SAML logout responses.
     */
    binding?: pulumi.Input<string>;
    /**
     * Boolean, (Default=true) Indicates whether or not a UPN claim should be created.
     */
    createUpnClaim?: pulumi.Input<boolean>;
    /**
     * String. Destination of the SAML Response. If not specified, it will be AssertionConsumerUrlof SAMLRequest or Callback URL if there was no SAMLRequest.
     */
    destination?: pulumi.Input<string>;
    /**
     * String, (Default=`sha1`). Algorithm used to calculate the digest of the SAML Assertion or response. Options include `defaultsha1` and `sha256`.
     */
    digestAlgorithm?: pulumi.Input<string>;
    /**
     * Boolean,(Default=true). Indicates whether or not we should infer the NameFormat based on the attribute name. If set to false, the attribute NameFormat is not set in the assertion.
     */
    includeAttributeNameFormat?: pulumi.Input<boolean>;
    /**
     * Integer, (Default=3600). Number of seconds during which the token is valid.
     */
    lifetimeInSeconds?: pulumi.Input<number>;
    /**
     * Map(Resource). Configuration settings for logout. For details, see Logout.
     */
    logout?: pulumi.Input<inputs.ClientAddonsSamlpLogout>;
    /**
     * Boolean, (Default=true). Indicates whether or not to add additional identity information in the token, such as the provider used and the access_token, if available.
     */
    mapIdentities?: pulumi.Input<boolean>;
    /**
     * Boolean, (Default=false). Indicates whether or not to add a prefix of `http://schema.auth0.com` to any claims that are not mapped to the common profile when passed through in the output assertion.
     */
    mapUnknownClaimsAsIs?: pulumi.Input<boolean>;
    /**
     * Map(String). Mappings between the Auth0 user profile property name (`name`) and the output attributes on the SAML attribute in the assertion (`value`).
     */
    mappings?: pulumi.Input<{[key: string]: any}>;
    /**
     * String, (Default=`urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified`). Format of the name identifier.
     */
    nameIdentifierFormat?: pulumi.Input<string>;
    /**
     * List(String). Attributes that can be used for Subject/NameID. Auth0 will try each of the attributes of this array in order and use the first value it finds.
     */
    nameIdentifierProbes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean, (Default=true). Indicates whether or not to passthrough claims that are not mapped to the common profile in the output assertion.
     */
    passthroughClaimsWithNoMapping?: pulumi.Input<boolean>;
    /**
     * String. Recipient of the SAML Assertion (SubjectConfirmationData). Default is AssertionConsumerUrl on SAMLRequest or Callback URL if no SAMLRequest was sent.
     */
    recipient?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not the SAML Response should be signed instead of the SAML Assertion.
     */
    signResponse?: pulumi.Input<boolean>;
    /**
     * String, (Default=`rsa-sha1`). Algorithm used to sign the SAML Assertion or response. Options include `rsa-sha1` and `rsa-sha256`.
     */
    signatureAlgorithm?: pulumi.Input<string>;
    /**
     * Boolean, (Default=true). Indicates whether or not we should infer the `xs:type` of the element. Types include `xs:string`, `xs:boolean`, `xs:double`, and `xs:anyType`. When set to false, all `xs:type` are `xs:anyType`.
     */
    typedAttributes?: pulumi.Input<boolean>;
}

export interface ClientAddonsSamlpLogout {
    /**
     * String. Service provider's Single Logout Service URL, to which Auth0 will send logout requests and responses.
     */
    callback?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not Auth0 should notify service providers of session termination.
     */
    sloEnabled?: pulumi.Input<boolean>;
}

export interface ClientJwtConfiguration {
    /**
     * String. Algorithm used to sign JWTs.
     */
    alg?: pulumi.Input<string>;
    /**
     * Integer. Number of seconds during which the JWT will be valid.
     */
    lifetimeInSeconds?: pulumi.Input<number>;
    /**
     * Map(String). Permissions (scopes) included in JWTs.
     */
    scopes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Boolean. Indicates whether or not the client secret is base64 encoded.
     */
    secretEncoded?: pulumi.Input<boolean>;
}

export interface ClientMobile {
    /**
     * List(Resource). Configuration settings for Android native apps. For details, see Android.
     */
    android?: pulumi.Input<inputs.ClientMobileAndroid>;
    /**
     * List(Resource). Configuration settings for i0S native apps. For details, see iOS.
     */
    ios?: pulumi.Input<inputs.ClientMobileIos>;
}

export interface ClientMobileAndroid {
    /**
     * String
     */
    appPackageName?: pulumi.Input<string>;
    /**
     * List(String)
     */
    sha256CertFingerprints?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ClientMobileIos {
    /**
     * String
     */
    appBundleIdentifier?: pulumi.Input<string>;
    /**
     * String
     */
    teamId?: pulumi.Input<string>;
}

export interface ClientRefreshToken {
    expirationType: pulumi.Input<string>;
    leeway?: pulumi.Input<number>;
    rotationType: pulumi.Input<string>;
    tokenLifetime?: pulumi.Input<number>;
}

export interface ConnectionOptions {
    /**
     * ADFS Metadata source.
     */
    adfsServer?: pulumi.Input<string>;
    /**
     * List of allowed audiences.
     */
    allowedAudiences?: pulumi.Input<pulumi.Input<string>[]>;
    apiEnableUsers?: pulumi.Input<boolean>;
    /**
     * Azure AD domain name.
     *
     * @deprecated use domain instead
     */
    appDomain?: pulumi.Input<string>;
    /**
     * Azure AD app ID.
     */
    appId?: pulumi.Input<string>;
    authorizationEndpoint?: pulumi.Input<string>;
    /**
     * Indicates whether or not to enable brute force protection, which will limit the number of signups and failed logins from a suspicious IP address.
     */
    bruteForceProtection?: pulumi.Input<boolean>;
    /**
     * OIDC provider client ID.
     */
    clientId?: pulumi.Input<string>;
    /**
     * OIDC provider client secret.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * String.
     */
    communityBaseUrl?: pulumi.Input<string>;
    /**
     * A case-sensitive map of key value pairs used as configuration variables for the `customScript`.
     */
    configuration?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Custom database action scripts. For more information, read [Custom Database Action Script Templates](https://auth0.com/docs/connections/database/custom-db/templates).
     */
    customScripts?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (Boolean) When enabled additional debugging information will be generated.
     */
    debug?: pulumi.Input<boolean>;
    /**
     * Sign Request Algorithm Digest
     */
    digestAlgorithm?: pulumi.Input<string>;
    disableCache?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not to allow user sign-ups to your application.
     */
    disableSignup?: pulumi.Input<boolean>;
    /**
     * OpenID discovery URL. E.g. `https://auth.example.com/.well-known/openid-configuration`.
     */
    discoveryUrl?: pulumi.Input<string>;
    domain?: pulumi.Input<string>;
    /**
     * List of the domains that can be authenticated using the Identity Provider. Only needed for Identifier First authentication flows.
     */
    domainAliases?: pulumi.Input<pulumi.Input<string>[]>;
    enabledDatabaseCustomization?: pulumi.Input<boolean>;
    /**
     * SAML Attributes mapping. If you're configuring a SAML enterprise connection for a non-standard PingFederate Server, you must update the attribute mappings.
     */
    fieldsMap?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * SMS number for the sender. Used when SMS Source is From.
     */
    from?: pulumi.Input<string>;
    iconUrl?: pulumi.Input<string>;
    identityApi?: pulumi.Input<string>;
    idpInitiated?: pulumi.Input<inputs.ConnectionOptionsIdpInitiated>;
    /**
     * Indicates whether or not you have a legacy user store and want to gradually migrate those users to the Auth0 user store. [Learn more](https://auth0.com/docs/users/guides/configure-automatic-migration).
     */
    importMode?: pulumi.Input<boolean>;
    ips?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Issuer URL. E.g. `https://auth.example.com`
     */
    issuer?: pulumi.Input<string>;
    jwksUri?: pulumi.Input<string>;
    /**
     * Key ID.
     */
    keyId?: pulumi.Input<string>;
    /**
     * Maximum number of groups to retrieve.
     */
    maxGroupsToRetrieve?: pulumi.Input<string>;
    /**
     * SID for Copilot. Used when SMS Source is Copilot.
     */
    messagingServiceSid?: pulumi.Input<string>;
    /**
     * Name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings for password complexity. For details, see Password Complexity Options.
     */
    passwordComplexityOptions?: pulumi.Input<inputs.ConnectionOptionsPasswordComplexityOptions>;
    /**
     * Configuration settings for the password dictionary check, which does not allow passwords that are part of the password dictionary. For details, see Password Dictionary.
     */
    passwordDictionary?: pulumi.Input<inputs.ConnectionOptionsPasswordDictionary>;
    /**
     * Configuration settings for the password history that is maintained for each user to prevent the reuse of passwords. For details, see Password History.
     */
    passwordHistories?: pulumi.Input<pulumi.Input<inputs.ConnectionOptionsPasswordHistory>[]>;
    /**
     * Configuration settings for the password personal info check, which does not allow passwords that contain any part of the user's personal data, including user's name, username, nickname, user_metadata.name, user_metadata.first, user_metadata.last, user's email, or first part of the user's email. For details, see Password No Personal Info.
     */
    passwordNoPersonalInfo?: pulumi.Input<inputs.ConnectionOptionsPasswordNoPersonalInfo>;
    /**
     * Indicates level of password strength to enforce during authentication. A strong password policy will make it difficult, if not improbable, for someone to guess a password through either manual or automated means. Options include `none`, `low`, `fair`, `good`, `excellent`.
     */
    passwordPolicy?: pulumi.Input<string>;
    /**
     * The SAML Response Binding - how the SAML token is received by Auth0 from IdP. Two possible values are `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect` (default) and `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST`
     */
    protocolBinding?: pulumi.Input<string>;
    /**
     * Template that formats the SAML request
     */
    requestTemplate?: pulumi.Input<string>;
    /**
     * Indicates whether or not the user is required to provide a username in addition to an email address.
     */
    requiresUsername?: pulumi.Input<boolean>;
    /**
     * Scopes required by the connection. The value must be a list, for example `["openid", "profile", "email"]`.
     */
    scopes?: pulumi.Input<pulumi.Input<string>[]>;
    scripts?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * SAML single login URL for the connection.
     */
    signInEndpoint?: pulumi.Input<string>;
    /**
     * SAML single logout URL for the connection.
     */
    signOutEndpoint?: pulumi.Input<string>;
    /**
     * (Boolean) When enabled, the SAML authentication request will be signed.
     */
    signSamlRequest?: pulumi.Input<boolean>;
    /**
     * Sign Request Algorithm
     */
    signatureAlgorithm?: pulumi.Input<string>;
    /**
     * The X.509 signing certificate (encoded in PEM or CER) you retrieved from the IdP, Base64-encoded
     */
    signingCert?: pulumi.Input<string>;
    /**
     * Version 1 is deprecated, use version 2.
     */
    strategyVersion?: pulumi.Input<number>;
    subject?: pulumi.Input<string>;
    /**
     * Syntax of the SMS. Options include `markdown` and `liquid`.
     */
    syntax?: pulumi.Input<string>;
    /**
     * Team ID.
     */
    teamId?: pulumi.Input<string>;
    /**
     * Template for the SMS. You can use `@@password@@` as a placeholder for the password value.
     */
    template?: pulumi.Input<string>;
    tenantDomain?: pulumi.Input<string>;
    tokenEndpoint?: pulumi.Input<string>;
    /**
     * Configuration options for one-time passwords. For details, see TOTP.
     */
    totp?: pulumi.Input<inputs.ConnectionOptionsTotp>;
    /**
     * SID for your Twilio account.
     */
    twilioSid?: pulumi.Input<string>;
    /**
     * AuthToken for your Twilio account.
     */
    twilioToken?: pulumi.Input<string>;
    /**
     * Value can be `backChannel` or `frontChannel`.
     */
    type?: pulumi.Input<string>;
    useCertAuth?: pulumi.Input<boolean>;
    useKerberos?: pulumi.Input<boolean>;
    useWsfed?: pulumi.Input<boolean>;
    /**
     * Attribute in the SAML token that will be mapped to the userId property in Auth0.
     */
    userIdAttribute?: pulumi.Input<string>;
    userinfoEndpoint?: pulumi.Input<string>;
    /**
     * A map defining the validation options.
     */
    validation?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Indicates whether or not to use the common endpoint rather than the default endpoint. Typically enabled if you're using this for a multi-tenant application in Azure AD.
     */
    waadCommonEndpoint?: pulumi.Input<boolean>;
    waadProtocol?: pulumi.Input<string>;
}

export interface ConnectionOptionsIdpInitiated {
    clientAuthorizeQuery?: pulumi.Input<string>;
    /**
     * Facebook client ID.
     */
    clientId?: pulumi.Input<string>;
    clientProtocol?: pulumi.Input<string>;
}

export interface ConnectionOptionsPasswordComplexityOptions {
    /**
     * Minimum number of characters allowed in passwords.
     */
    minLength?: pulumi.Input<number>;
}

export interface ConnectionOptionsPasswordDictionary {
    /**
     * Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
     */
    dictionaries?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
     */
    enable?: pulumi.Input<boolean>;
}

export interface ConnectionOptionsPasswordHistory {
    /**
     * Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
     */
    enable?: pulumi.Input<boolean>;
    /**
     * Indicates the number of passwords to keep in history with a maximum of 24.
     */
    size?: pulumi.Input<number>;
}

export interface ConnectionOptionsPasswordNoPersonalInfo {
    /**
     * Indicates whether the password personal info check is enabled for this connection.
     */
    enable?: pulumi.Input<boolean>;
}

export interface ConnectionOptionsTotp {
    /**
     * Integer. Length of the one-time password.
     */
    length?: pulumi.Input<number>;
    /**
     * Integer. Seconds between allowed generation of new passwords.
     */
    timeStep?: pulumi.Input<number>;
}

export interface CustomDomainVerification {
    /**
     * List(Map). Verification methods for the domain.
     */
    methods?: pulumi.Input<any[]>;
}

export interface EmailCredentials {
    /**
     * String, Case-sensitive. AWS Access Key ID. Used only for AWS.
     */
    accessKeyId?: pulumi.Input<string>;
    /**
     * String, Case-sensitive. API Key for your email service. Will always be encrypted in our database.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * String. API User for your email service.
     */
    apiUser?: pulumi.Input<string>;
    domain?: pulumi.Input<string>;
    /**
     * String. Default region. Used only for AWS, Mailgun, and SparkPost.
     */
    region?: pulumi.Input<string>;
    /**
     * String, Case-sensitive. AWS Secret Key. Will always be encrypted in our database. Used only for AWS.
     */
    secretAccessKey?: pulumi.Input<string>;
    /**
     * String. Hostname or IP address of your SMTP server. Used only for SMTP.
     */
    smtpHost?: pulumi.Input<string>;
    /**
     * String, Case-sensitive. SMTP password. Used only for SMTP.
     */
    smtpPass?: pulumi.Input<string>;
    /**
     * Integer. Port used by your SMTP server. Please avoid using port 25 if possible because many providers have limitations on this port. Used only for SMTP.
     */
    smtpPort?: pulumi.Input<number>;
    /**
     * String. SMTP username. Used only for SMTP.
     */
    smtpUser?: pulumi.Input<string>;
}

export interface GlobalClientAddons {
    aws?: pulumi.Input<{[key: string]: any}>;
    azureBlob?: pulumi.Input<{[key: string]: any}>;
    azureSb?: pulumi.Input<{[key: string]: any}>;
    box?: pulumi.Input<{[key: string]: any}>;
    cloudbees?: pulumi.Input<{[key: string]: any}>;
    concur?: pulumi.Input<{[key: string]: any}>;
    dropbox?: pulumi.Input<{[key: string]: any}>;
    echosign?: pulumi.Input<{[key: string]: any}>;
    egnyte?: pulumi.Input<{[key: string]: any}>;
    firebase?: pulumi.Input<{[key: string]: any}>;
    layer?: pulumi.Input<{[key: string]: any}>;
    mscrm?: pulumi.Input<{[key: string]: any}>;
    newrelic?: pulumi.Input<{[key: string]: any}>;
    office365?: pulumi.Input<{[key: string]: any}>;
    rms?: pulumi.Input<{[key: string]: any}>;
    salesforce?: pulumi.Input<{[key: string]: any}>;
    salesforceApi?: pulumi.Input<{[key: string]: any}>;
    salesforceSandboxApi?: pulumi.Input<{[key: string]: any}>;
    samlp?: pulumi.Input<inputs.GlobalClientAddonsSamlp>;
    sapApi?: pulumi.Input<{[key: string]: any}>;
    sentry?: pulumi.Input<{[key: string]: any}>;
    sharepoint?: pulumi.Input<{[key: string]: any}>;
    slack?: pulumi.Input<{[key: string]: any}>;
    springcm?: pulumi.Input<{[key: string]: any}>;
    wams?: pulumi.Input<{[key: string]: any}>;
    wsfed?: pulumi.Input<{[key: string]: any}>;
    zendesk?: pulumi.Input<{[key: string]: any}>;
    zoom?: pulumi.Input<{[key: string]: any}>;
}

export interface GlobalClientAddonsSamlp {
    audience?: pulumi.Input<string>;
    authnContextClassRef?: pulumi.Input<string>;
    binding?: pulumi.Input<string>;
    createUpnClaim?: pulumi.Input<boolean>;
    destination?: pulumi.Input<string>;
    digestAlgorithm?: pulumi.Input<string>;
    includeAttributeNameFormat?: pulumi.Input<boolean>;
    lifetimeInSeconds?: pulumi.Input<number>;
    logout?: pulumi.Input<inputs.GlobalClientAddonsSamlpLogout>;
    mapIdentities?: pulumi.Input<boolean>;
    mapUnknownClaimsAsIs?: pulumi.Input<boolean>;
    mappings?: pulumi.Input<{[key: string]: any}>;
    nameIdentifierFormat?: pulumi.Input<string>;
    nameIdentifierProbes?: pulumi.Input<pulumi.Input<string>[]>;
    passthroughClaimsWithNoMapping?: pulumi.Input<boolean>;
    recipient?: pulumi.Input<string>;
    signResponse?: pulumi.Input<boolean>;
    signatureAlgorithm?: pulumi.Input<string>;
    typedAttributes?: pulumi.Input<boolean>;
}

export interface GlobalClientAddonsSamlpLogout {
    callback?: pulumi.Input<string>;
    sloEnabled?: pulumi.Input<boolean>;
}

export interface GlobalClientJwtConfiguration {
    alg?: pulumi.Input<string>;
    lifetimeInSeconds?: pulumi.Input<number>;
    scopes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    secretEncoded?: pulumi.Input<boolean>;
}

export interface GlobalClientMobile {
    android?: pulumi.Input<inputs.GlobalClientMobileAndroid>;
    ios?: pulumi.Input<inputs.GlobalClientMobileIos>;
}

export interface GlobalClientMobileAndroid {
    appPackageName?: pulumi.Input<string>;
    sha256CertFingerprints?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GlobalClientMobileIos {
    appBundleIdentifier?: pulumi.Input<string>;
    teamId?: pulumi.Input<string>;
}

export interface GlobalClientRefreshToken {
    expirationType: pulumi.Input<string>;
    leeway?: pulumi.Input<number>;
    rotationType: pulumi.Input<string>;
    tokenLifetime?: pulumi.Input<number>;
}

export interface LogStreamSink {
    awsAccountId?: pulumi.Input<string>;
    awsPartnerEventSource?: pulumi.Input<string>;
    awsRegion?: pulumi.Input<string>;
    azurePartnerTopic?: pulumi.Input<string>;
    azureRegion?: pulumi.Input<string>;
    azureResourceGroup?: pulumi.Input<string>;
    azureSubscriptionId?: pulumi.Input<string>;
    datadogApiKey?: pulumi.Input<string>;
    datadogRegion?: pulumi.Input<string>;
    httpAuthorization?: pulumi.Input<string>;
    httpContentFormat?: pulumi.Input<string>;
    httpContentType?: pulumi.Input<string>;
    httpCustomHeaders?: pulumi.Input<pulumi.Input<string>[]>;
    httpEndpoint?: pulumi.Input<string>;
    splunkDomain?: pulumi.Input<string>;
    splunkPort?: pulumi.Input<string>;
    splunkSecure?: pulumi.Input<boolean>;
    splunkToken?: pulumi.Input<string>;
}

export interface ResourceServerScope {
    /**
     * String. Description of the permission (scope).
     */
    description?: pulumi.Input<string>;
    /**
     * String. Name of the permission (scope). Examples include `read:appointments` or `delete:appointments`.
     */
    value: pulumi.Input<string>;
}

export interface RolePermission {
    /**
     * String. Name of the permission (scope).
     */
    name: pulumi.Input<string>;
    /**
     * String. Unique identifier for the resource server.
     */
    resourceServerIdentifier: pulumi.Input<string>;
}

export interface TenantChangePassword {
    /**
     * Boolean. Indicates whether or not to use the custom change password page.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * String, HTML format with supported Liquid syntax. Customized content of the change password page.
     */
    html: pulumi.Input<string>;
}

export interface TenantErrorPage {
    /**
     * String, HTML format with supported Liquid syntax. Customized content of the error page.
     */
    html: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not to show the link to logs as part of the default error page.
     */
    showLogLink: pulumi.Input<boolean>;
    /**
     * String. URL to redirect to when an error occurs rather than showing the default error page.
     */
    url: pulumi.Input<string>;
}

export interface TenantFlags {
    /**
     * Boolean. Indicates whether or not to use the older v1 change password flow. Not recommended except for backward compatibility.
     */
    changePwdFlowV1?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicated whether or not classic Universal Login prompts include additional security headers to prevent clickjacking.
     */
    disableClickjackProtectionHeaders?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not the APIs section is enabled for the tenant.
     */
    enableApisSection?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not all current connections should be enabled when a new client is created.
     */
    enableClientConnections?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not the tenant allows custom domains in emails.
     */
    enableCustomDomainInEmails?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not the tenant allows dynamic client registration.
     */
    enableDynamicClientRegistration?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not to use the older v2 legacy logs search.
     */
    enableLegacyLogsSearchV2?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not advanced API Authorization scenarios are enabled.
     */
    enablePipeline2?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not the public sign up process shows a userExists error if the user already exists.
     */
    enablePublicSignupUserExistsError?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not the tenant uses universal login.
     */
    universalLogin?: pulumi.Input<boolean>;
    useScopeDescriptionsForConsent?: pulumi.Input<boolean>;
}

export interface TenantGuardianMfaPage {
    /**
     * Boolean. Indicates whether or not to use the custom Guardian page.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * String, HTML format with supported Liquid syntax. Customized content of the Guardian page.
     */
    html: pulumi.Input<string>;
}

export interface TenantUniversalLogin {
    /**
     * List(Resource). Configuration settings for Universal Login colors. See Universal Login - Colors.
     */
    colors?: pulumi.Input<inputs.TenantUniversalLoginColors>;
}

export interface TenantUniversalLoginColors {
    /**
     * String, Hexadecimal. Background color of login pages.
     */
    pageBackground?: pulumi.Input<string>;
    /**
     * String, Hexadecimal. Primary button background color.
     */
    primary?: pulumi.Input<string>;
}
