// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Actions are secure, tenant-specific, versioned functions written in Node.js that execute at certain points during the Auth0 runtime. Actions are used to customize and extend Auth0's capabilities with custom logic.
 *
 * ## Import
 *
 * This resource can be imported by specifying the action ID. # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/action:Action my_action "12f4f21b-017a-319d-92e7-2291c1ca36c4"
 * ```
 *
 *  ~> For security reasons importing `secrets` is not allowed. Therefore, it is advised to import the action without secrets and adding them back after the action has been imported.
 */
export class Action extends pulumi.CustomResource {
    /**
     * Get an existing Action resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ActionState, opts?: pulumi.CustomResourceOptions): Action {
        return new Action(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/action:Action';

    /**
     * Returns true if the given object is an instance of Action.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Action {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Action.__pulumiType;
    }

    /**
     * The source code of the action.
     */
    public readonly code!: pulumi.Output<string>;
    /**
     * List of third party npm modules, and their versions, that this action depends on.
     */
    public readonly dependencies!: pulumi.Output<outputs.ActionDependency[] | undefined>;
    /**
     * Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
     */
    public readonly deploy!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the action.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
     */
    public readonly runtime!: pulumi.Output<string>;
    /**
     * List of secrets that are included in an action or a version of an action.
     */
    public readonly secrets!: pulumi.Output<outputs.ActionSecret[] | undefined>;
    /**
     * List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
     */
    public readonly supportedTriggers!: pulumi.Output<outputs.ActionSupportedTriggers>;
    /**
     * Version ID of the action. This value is available if `deploy` is set to true.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;

    /**
     * Create a Action resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ActionArgs | ActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ActionState | undefined;
            resourceInputs["code"] = state ? state.code : undefined;
            resourceInputs["dependencies"] = state ? state.dependencies : undefined;
            resourceInputs["deploy"] = state ? state.deploy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["runtime"] = state ? state.runtime : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["supportedTriggers"] = state ? state.supportedTriggers : undefined;
            resourceInputs["versionId"] = state ? state.versionId : undefined;
        } else {
            const args = argsOrState as ActionArgs | undefined;
            if ((!args || args.code === undefined) && !opts.urn) {
                throw new Error("Missing required property 'code'");
            }
            if ((!args || args.supportedTriggers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'supportedTriggers'");
            }
            resourceInputs["code"] = args ? args.code : undefined;
            resourceInputs["dependencies"] = args ? args.dependencies : undefined;
            resourceInputs["deploy"] = args ? args.deploy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["runtime"] = args ? args.runtime : undefined;
            resourceInputs["secrets"] = args ? args.secrets : undefined;
            resourceInputs["supportedTriggers"] = args ? args.supportedTriggers : undefined;
            resourceInputs["versionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Action.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Action resources.
 */
export interface ActionState {
    /**
     * The source code of the action.
     */
    code?: pulumi.Input<string>;
    /**
     * List of third party npm modules, and their versions, that this action depends on.
     */
    dependencies?: pulumi.Input<pulumi.Input<inputs.ActionDependency>[]>;
    /**
     * Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
     */
    deploy?: pulumi.Input<boolean>;
    /**
     * The name of the action.
     */
    name?: pulumi.Input<string>;
    /**
     * The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
     */
    runtime?: pulumi.Input<string>;
    /**
     * List of secrets that are included in an action or a version of an action.
     */
    secrets?: pulumi.Input<pulumi.Input<inputs.ActionSecret>[]>;
    /**
     * List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
     */
    supportedTriggers?: pulumi.Input<inputs.ActionSupportedTriggers>;
    /**
     * Version ID of the action. This value is available if `deploy` is set to true.
     */
    versionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Action resource.
 */
export interface ActionArgs {
    /**
     * The source code of the action.
     */
    code: pulumi.Input<string>;
    /**
     * List of third party npm modules, and their versions, that this action depends on.
     */
    dependencies?: pulumi.Input<pulumi.Input<inputs.ActionDependency>[]>;
    /**
     * Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
     */
    deploy?: pulumi.Input<boolean>;
    /**
     * The name of the action.
     */
    name?: pulumi.Input<string>;
    /**
     * The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
     */
    runtime?: pulumi.Input<string>;
    /**
     * List of secrets that are included in an action or a version of an action.
     */
    secrets?: pulumi.Input<pulumi.Input<inputs.ActionSecret>[]>;
    /**
     * List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
     */
    supportedTriggers: pulumi.Input<inputs.ActionSupportedTriggers>;
}
