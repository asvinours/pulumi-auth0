// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * With Auth0, you can define sources of users, otherwise known as connections, which may include identity providers (such as Google or LinkedIn), databases, or passwordless authentication methods. This resource allows you to configure and manage connections to be used with your clients and users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myConnection = new auth0.Connection("my_connection", {
 *     options: {
 *         bruteForceProtection: true,
 *         configuration: {
 *             bar: "baz",
 *             foo: "bar",
 *         },
 *         customScripts: {
 *             get_user: `function getByEmail (email, callback) {
 *   return callback(new Error("Whoops!"))
 * }
 * `,
 *         },
 *         enabledDatabaseCustomization: true,
 *         passwordHistories: [{
 *             enable: true,
 *             size: 3,
 *         }],
 *         passwordPolicy: "excellent",
 *     },
 *     strategy: "auth0",
 * });
 * ```
 *
 * > The Auth0 dashboard displays only one connection per social provider. Although the Auth0 Management API allowes the creation of multiple connections per strategy, the additional connections may not be visible in the Auth0 dashboard.
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
     * Name used in login screen
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
     */
    public readonly enabledClients!: pulumi.Output<string[]>;
    /**
     * Indicates whether or not the connection is domain level.
     */
    public readonly isDomainConnection!: pulumi.Output<boolean>;
    /**
     * Name of the connection.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration settings for connection options. For details, see Options.
     */
    public readonly options!: pulumi.Output<outputs.ConnectionOptions | undefined>;
    /**
     * Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
     */
    public readonly realms!: pulumi.Output<string[]>;
    /**
     * Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
     */
    public readonly strategy!: pulumi.Output<string>;
    /**
     * Version 1 is deprecated, use version 2.
     */
    public readonly strategyVersion!: pulumi.Output<string>;
    /**
     * Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
     */
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            inputs["displayName"] = state ? state.displayName : undefined;
            inputs["enabledClients"] = state ? state.enabledClients : undefined;
            inputs["isDomainConnection"] = state ? state.isDomainConnection : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["options"] = state ? state.options : undefined;
            inputs["realms"] = state ? state.realms : undefined;
            inputs["strategy"] = state ? state.strategy : undefined;
            inputs["strategyVersion"] = state ? state.strategyVersion : undefined;
            inputs["validation"] = state ? state.validation : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["enabledClients"] = args ? args.enabledClients : undefined;
            inputs["isDomainConnection"] = args ? args.isDomainConnection : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["options"] = args ? args.options : undefined;
            inputs["realms"] = args ? args.realms : undefined;
            inputs["strategy"] = args ? args.strategy : undefined;
            inputs["strategyVersion"] = args ? args.strategyVersion : undefined;
            inputs["validation"] = args ? args.validation : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Connection.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Name used in login screen
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
     */
    readonly enabledClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether or not the connection is domain level.
     */
    readonly isDomainConnection?: pulumi.Input<boolean>;
    /**
     * Name of the connection.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Configuration settings for connection options. For details, see Options.
     */
    readonly options?: pulumi.Input<inputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
     */
    readonly realms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
     */
    readonly strategy?: pulumi.Input<string>;
    /**
     * Version 1 is deprecated, use version 2.
     */
    readonly strategyVersion?: pulumi.Input<string>;
    /**
     * Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
     */
    readonly validation?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Name used in login screen
     */
    readonly displayName?: pulumi.Input<string>;
    /**
     * IDs of the clients for which the connection is enabled. If not specified, no clients are enabled.
     */
    readonly enabledClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether or not the connection is domain level.
     */
    readonly isDomainConnection?: pulumi.Input<boolean>;
    /**
     * Name of the connection.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Configuration settings for connection options. For details, see Options.
     */
    readonly options?: pulumi.Input<inputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (i.e., email domains). If not specified, the connection name is added as the realm.
     */
    readonly realms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of the connection, which indicates the identity provider. Options include `ad`, `adfs`, `amazon`, `aol`, `apple`, `auth0`, `auth0-adldap`, `auth0-oidc`, `baidu`, `bitbucket`, `bitly`, `box`, `custom`, `daccount`, `dropbox`, `dwolla`, `email`, `evernote`, `evernote-sandbox`, `exact`, `facebook`, `fitbit`, `flickr`, `github`, `google-apps`, `google-oauth2`, `guardian`, `instagram`, `ip`, `line`, `linkedin`, `miicard`, `oauth1`, `oauth2`, `office365`, `oidc`, `paypal`, `paypal-sandbox`, `pingfederate`, `planningcenter`, `renren`, `salesforce`, `salesforce-community`, `salesforce-sandbox` `samlp`, `sharepoint`, `shopify`, `sms`, `soundcloud`, `thecity`, `thecity-sandbox`, `thirtysevensignals`, `twitter`, `untappd`, `vkontakte`, `waad`, `weibo`, `windowslive`, `wordpress`, `yahoo`, `yammer`, `yandex`.
     */
    readonly strategy: pulumi.Input<string>;
    /**
     * Version 1 is deprecated, use version 2.
     */
    readonly strategyVersion?: pulumi.Input<string>;
    /**
     * Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
     */
    readonly validation?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
