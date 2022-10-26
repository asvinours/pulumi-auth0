// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With Auth0, you can define sources of users, otherwise known as connections, which may include identity providers (such as Google or LinkedIn), databases, or passwordless authentication methods. This resource allows you to configure and manage connections to be used with your clients and users.
 *
 * > The Auth0 dashboard displays only one connection per social provider. Although the Auth0 Management API allows the
 * creation of multiple connections per strategy, the additional connections may not be visible in the Auth0 dashboard.
 *
 * ## Example Usage
 * ### Google OAuth2 Connection
 *
 * > Your Auth0 account may be pre-configured with a `google-oauth2` connection.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const googleOauth2 = new auth0.Connection("google_oauth2", {
 *     options: {
 *         allowedAudiences: [
 *             "example.com",
 *             "api.example.com",
 *         ],
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "email",
 *             "profile",
 *             "gmail",
 *             "youtube",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *     },
 *     strategy: "google-oauth2",
 * });
 * ```
 * ### Facebook Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const facebook = new auth0.Connection("facebook", {
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "public_profile",
 *             "email",
 *             "groups_access_member_info",
 *             "user_birthday",
 *         ],
 *     },
 *     strategy: "facebook",
 * });
 * ```
 * ### Apple Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const apple = new auth0.Connection("apple", {
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<private-key>",
 *         keyId: "<key-id>",
 *         scopes: [
 *             "email",
 *             "name",
 *         ],
 *         teamId: "<team-id>",
 *     },
 *     strategy: "apple",
 * });
 * ```
 * ### LinkedIn Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const linkedin = new auth0.Connection("linkedin", {
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "basic_profile",
 *             "profile",
 *             "email",
 *         ],
 *         strategyVersion: 2,
 *     },
 *     strategy: "linkedin",
 * });
 * ```
 * ### GitHub Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const github = new auth0.Connection("github", {
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "email",
 *             "profile",
 *             "public_repo",
 *             "repo",
 *         ],
 *     },
 *     strategy: "github",
 * });
 * ```
 * ### SalesForce Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const salesforce = new auth0.Connection("salesforce", {
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         communityBaseUrl: "https://salesforce.example.com",
 *     },
 *     strategy: "salesforce",
 * });
 * ```
 * ### OAuth2 Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const oauth2 = new auth0.Connection("oauth2", {
 *     options: {
 *         authorizationEndpoint: "https://auth.example.com/oauth2/authorize",
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         pkceEnabled: true,
 *         scripts: {
 *             fetchUserProfile: `        function fetchUserProfile(accessToken, context, callback) {
 *           return callback(new Error("Whoops!"));
 *         }
 *       `,
 *         },
 *         tokenEndpoint: "https://auth.example.com/oauth2/token",
 *     },
 *     strategy: "oauth2",
 * });
 * ```
 * ### SMS Connection
 *
 * > To be able to see this in the management dashboard as well, the name of the connection must be set to "sms".
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const sms = new auth0.Connection("sms", {
 *     isDomainConnection: false,
 *     options: {
 *         bruteForceProtection: true,
 *         disableSignup: false,
 *         forwardRequestInfo: true,
 *         from: "+15555555555",
 *         gatewayAuthentication: {
 *             audience: "https://somewhere.com/sms-gateway",
 *             method: "bearer",
 *             secret: "4e2680bb74ec2ae24736476dd37ed6c2",
 *             secretBase64Encoded: false,
 *             subject: "test.us.auth0.com:sms",
 *         },
 *         gatewayUrl: "https://somewhere.com/sms-gateway",
 *         name: "sms",
 *         provider: "sms_gateway",
 *         syntax: "md_with_macros",
 *         template: "@@password@@",
 *         totp: {
 *             length: 6,
 *             timeStep: 300,
 *         },
 *     },
 *     strategy: "sms",
 * });
 * ```
 * ### Email Connection
 *
 * > To be able to see this in the management dashboard as well, the name of the connection must be set to "email".
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const passwordlessEmail = new auth0.Connection("passwordless_email", {
 *     options: {
 *         authParams: {
 *             response_type: "code",
 *             scope: "openid email profile offline_access",
 *         },
 *         bruteForceProtection: true,
 *         disableSignup: false,
 *         from: "{{ application.name }} <root@auth0.com>",
 *         nonPersistentAttrs: [],
 *         setUserRootAttributes: [],
 *         subject: "Welcome to {{ application.name }}",
 *         syntax: "liquid",
 *         template: "<html>This is the body of the email</html>",
 *         totp: {
 *             length: 6,
 *             timeStep: 300,
 *         },
 *     },
 *     strategy: "email",
 * });
 * ```
 * ### WindowsLive Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const windowslive = new auth0.Connection("windowslive", {
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "signin",
 *             "graph_user",
 *         ],
 *         strategyVersion: 2,
 *     },
 *     strategy: "windowslive",
 * });
 * ```
 *
 * ## Import
 *
 * Connections can be imported using their ID. # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/connection:Connection google con_a17f21fdb24d48a0
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Name used in login screen.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    public readonly enabledClients!: pulumi.Output<string[]>;
    /**
     * Indicates whether the connection is domain level.
     */
    public readonly isDomainConnection!: pulumi.Output<boolean>;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars). Maximum of 10 metadata properties allowed.
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Name of the connection.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration settings for connection options.
     */
    public readonly options!: pulumi.Output<outputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    public readonly realms!: pulumi.Output<string[]>;
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    public readonly showAsButton!: pulumi.Output<boolean | undefined>;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    public readonly strategy!: pulumi.Output<string>;
    public readonly strategyVersion!: pulumi.Output<string>;
    public readonly validation!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["enabledClients"] = state ? state.enabledClients : undefined;
            resourceInputs["isDomainConnection"] = state ? state.isDomainConnection : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["realms"] = state ? state.realms : undefined;
            resourceInputs["showAsButton"] = state ? state.showAsButton : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
            resourceInputs["strategyVersion"] = state ? state.strategyVersion : undefined;
            resourceInputs["validation"] = state ? state.validation : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["enabledClients"] = args ? args.enabledClients : undefined;
            resourceInputs["isDomainConnection"] = args ? args.isDomainConnection : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["realms"] = args ? args.realms : undefined;
            resourceInputs["showAsButton"] = args ? args.showAsButton : undefined;
            resourceInputs["strategy"] = args ? args.strategy : undefined;
            resourceInputs["strategyVersion"] = args ? args.strategyVersion : undefined;
            resourceInputs["validation"] = args ? args.validation : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Name used in login screen.
     */
    displayName?: pulumi.Input<string>;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    enabledClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether the connection is domain level.
     */
    isDomainConnection?: pulumi.Input<boolean>;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars). Maximum of 10 metadata properties allowed.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings for connection options.
     */
    options?: pulumi.Input<inputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    realms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    showAsButton?: pulumi.Input<boolean>;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    strategy?: pulumi.Input<string>;
    strategyVersion?: pulumi.Input<string>;
    validation?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Name used in login screen.
     */
    displayName?: pulumi.Input<string>;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    enabledClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether the connection is domain level.
     */
    isDomainConnection?: pulumi.Input<boolean>;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars). Maximum of 10 metadata properties allowed.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the connection.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings for connection options.
     */
    options?: pulumi.Input<inputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    realms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    showAsButton?: pulumi.Input<boolean>;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    strategy: pulumi.Input<string>;
    strategyVersion?: pulumi.Input<string>;
    validation?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
