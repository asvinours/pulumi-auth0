// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage all of the enabled clients on a connection.
 *
 * !> This resource appends an enabled client to a connection. In contrast, the `auth0.ConnectionClient` resource
 * manages all the enabled clients for a connection. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.ConnectionClient` resource when managing enabled clients for the same
 * connection id.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myConn = new auth0.Connection("myConn", {strategy: "auth0"});
 * const myFirstClient = new auth0.Client("myFirstClient", {});
 * const mySecondClient = new auth0.Client("mySecondClient", {});
 * // One connection to many clients association.
 * // To prevent issues, avoid using this resource together with the `auth0_connection_client` resource.
 * const myConnClientsAssoc = new auth0.ConnectionClients("myConnClientsAssoc", {
 *     connectionId: myConn.id,
 *     enabledClients: [
 *         myFirstClient.id,
 *         mySecondClient.id,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the Connection ID. # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/connectionClients:ConnectionClients my_conn_clients_assoc con_XXXXX
 * ```
 */
export class ConnectionClients extends pulumi.CustomResource {
    /**
     * Get an existing ConnectionClients resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionClientsState, opts?: pulumi.CustomResourceOptions): ConnectionClients {
        return new ConnectionClients(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/connectionClients:ConnectionClients';

    /**
     * Returns true if the given object is an instance of ConnectionClients.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectionClients {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectionClients.__pulumiType;
    }

    /**
     * ID of the connection on which to enable the client.
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    public readonly enabledClients!: pulumi.Output<string[]>;
    /**
     * The name of the connection on which to enable the client.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The strategy of the connection on which to enable the client.
     */
    public /*out*/ readonly strategy!: pulumi.Output<string>;

    /**
     * Create a ConnectionClients resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionClientsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionClientsArgs | ConnectionClientsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionClientsState | undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["enabledClients"] = state ? state.enabledClients : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
        } else {
            const args = argsOrState as ConnectionClientsArgs | undefined;
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.enabledClients === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabledClients'");
            }
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["enabledClients"] = args ? args.enabledClients : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["strategy"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectionClients.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectionClients resources.
 */
export interface ConnectionClientsState {
    /**
     * ID of the connection on which to enable the client.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    enabledClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the connection on which to enable the client.
     */
    name?: pulumi.Input<string>;
    /**
     * The strategy of the connection on which to enable the client.
     */
    strategy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConnectionClients resource.
 */
export interface ConnectionClientsArgs {
    /**
     * ID of the connection on which to enable the client.
     */
    connectionId: pulumi.Input<string>;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    enabledClients: pulumi.Input<pulumi.Input<string>[]>;
}
