// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can set up APIs that can be consumed from your authorized applications.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myResourceServer = new auth0.ResourceServer("myResourceServer", {
 *     allowOfflineAccess: true,
 *     identifier: "https://api.example.com",
 *     signingAlg: "RS256",
 *     skipConsentForVerifiableFirstPartyClients: true,
 *     tokenLifetime: 8600,
 * });
 * ```
 *
 * ## Import
 *
 * Existing resource servers can be imported using their ID.
 *
 * # 
 *
 *  Example:
 *
 * ```sh
 * $ pulumi import auth0:index/resourceServer:ResourceServer my_resource_server "XXXXXXXXXXXXXXXXXXXXXXX"
 * ```
 */
export class ResourceServer extends pulumi.CustomResource {
    /**
     * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceServerState, opts?: pulumi.CustomResourceOptions): ResourceServer {
        return new ResourceServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/resourceServer:ResourceServer';

    /**
     * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceServer.__pulumiType;
    }

    /**
     * Indicates whether refresh tokens can be issued for this resource server.
     */
    public readonly allowOfflineAccess!: pulumi.Output<boolean | undefined>;
    /**
     * If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     */
    public readonly enforcePolicies!: pulumi.Output<boolean>;
    /**
     * Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Friendly name for the resource server. Cannot include `<` or `>` characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     */
    public readonly signingAlg!: pulumi.Output<string>;
    /**
     * Secret used to sign tokens when using symmetric algorithms (HS256).
     */
    public readonly signingSecret!: pulumi.Output<string>;
    /**
     * Indicates whether to skip user consent for applications flagged as first party.
     */
    public readonly skipConsentForVerifiableFirstPartyClients!: pulumi.Output<boolean>;
    /**
     * Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
     */
    public readonly tokenDialect!: pulumi.Output<string | undefined>;
    /**
     * Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     */
    public readonly tokenLifetime!: pulumi.Output<number>;
    /**
     * Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
     */
    public readonly tokenLifetimeForWeb!: pulumi.Output<number>;
    /**
     * URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     */
    public readonly verificationLocation!: pulumi.Output<string | undefined>;

    /**
     * Create a ResourceServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceServerArgs | ResourceServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceServerState | undefined;
            resourceInputs["allowOfflineAccess"] = state ? state.allowOfflineAccess : undefined;
            resourceInputs["enforcePolicies"] = state ? state.enforcePolicies : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["signingAlg"] = state ? state.signingAlg : undefined;
            resourceInputs["signingSecret"] = state ? state.signingSecret : undefined;
            resourceInputs["skipConsentForVerifiableFirstPartyClients"] = state ? state.skipConsentForVerifiableFirstPartyClients : undefined;
            resourceInputs["tokenDialect"] = state ? state.tokenDialect : undefined;
            resourceInputs["tokenLifetime"] = state ? state.tokenLifetime : undefined;
            resourceInputs["tokenLifetimeForWeb"] = state ? state.tokenLifetimeForWeb : undefined;
            resourceInputs["verificationLocation"] = state ? state.verificationLocation : undefined;
        } else {
            const args = argsOrState as ResourceServerArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["allowOfflineAccess"] = args ? args.allowOfflineAccess : undefined;
            resourceInputs["enforcePolicies"] = args ? args.enforcePolicies : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["signingAlg"] = args ? args.signingAlg : undefined;
            resourceInputs["signingSecret"] = args ? args.signingSecret : undefined;
            resourceInputs["skipConsentForVerifiableFirstPartyClients"] = args ? args.skipConsentForVerifiableFirstPartyClients : undefined;
            resourceInputs["tokenDialect"] = args ? args.tokenDialect : undefined;
            resourceInputs["tokenLifetime"] = args ? args.tokenLifetime : undefined;
            resourceInputs["tokenLifetimeForWeb"] = args ? args.tokenLifetimeForWeb : undefined;
            resourceInputs["verificationLocation"] = args ? args.verificationLocation : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourceServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceServer resources.
 */
export interface ResourceServerState {
    /**
     * Indicates whether refresh tokens can be issued for this resource server.
     */
    allowOfflineAccess?: pulumi.Input<boolean>;
    /**
     * If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     */
    enforcePolicies?: pulumi.Input<boolean>;
    /**
     * Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Friendly name for the resource server. Cannot include `<` or `>` characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     */
    signingAlg?: pulumi.Input<string>;
    /**
     * Secret used to sign tokens when using symmetric algorithms (HS256).
     */
    signingSecret?: pulumi.Input<string>;
    /**
     * Indicates whether to skip user consent for applications flagged as first party.
     */
    skipConsentForVerifiableFirstPartyClients?: pulumi.Input<boolean>;
    /**
     * Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
     */
    tokenDialect?: pulumi.Input<string>;
    /**
     * Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     */
    tokenLifetime?: pulumi.Input<number>;
    /**
     * Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
     */
    tokenLifetimeForWeb?: pulumi.Input<number>;
    /**
     * URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     */
    verificationLocation?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceServer resource.
 */
export interface ResourceServerArgs {
    /**
     * Indicates whether refresh tokens can be issued for this resource server.
     */
    allowOfflineAccess?: pulumi.Input<boolean>;
    /**
     * If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
     */
    enforcePolicies?: pulumi.Input<boolean>;
    /**
     * Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
     */
    identifier: pulumi.Input<string>;
    /**
     * Friendly name for the resource server. Cannot include `<` or `>` characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     */
    signingAlg?: pulumi.Input<string>;
    /**
     * Secret used to sign tokens when using symmetric algorithms (HS256).
     */
    signingSecret?: pulumi.Input<string>;
    /**
     * Indicates whether to skip user consent for applications flagged as first party.
     */
    skipConsentForVerifiableFirstPartyClients?: pulumi.Input<boolean>;
    /**
     * Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
     */
    tokenDialect?: pulumi.Input<string>;
    /**
     * Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     */
    tokenLifetime?: pulumi.Input<number>;
    /**
     * Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
     */
    tokenLifetimeForWeb?: pulumi.Input<number>;
    /**
     * URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
     */
    verificationLocation?: pulumi.Input<string>;
}
