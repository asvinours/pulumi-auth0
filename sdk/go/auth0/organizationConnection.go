// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage enabled connections on an organization.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myConnection, err := auth0.NewConnection(ctx, "myConnection", &auth0.ConnectionArgs{
//				Strategy: pulumi.String("auth0"),
//			})
//			if err != nil {
//				return err
//			}
//			myOrganization, err := auth0.NewOrganization(ctx, "myOrganization", &auth0.OrganizationArgs{
//				DisplayName: pulumi.String("My Organization"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewOrganizationConnection(ctx, "myOrgConn", &auth0.OrganizationConnectionArgs{
//				OrganizationId:          myOrganization.ID(),
//				ConnectionId:            myConnection.ID(),
//				AssignMembershipOnLogin: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported by specifying the organization ID and connection ID separated by ":". # Example
//
// ```sh
//
//	$ pulumi import auth0:index/organizationConnection:OrganizationConnection my_org_conn org_XXXXX:con_XXXXX
//
// ```
type OrganizationConnection struct {
	pulumi.CustomResourceState

	// When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
	AssignMembershipOnLogin pulumi.BoolPtrOutput `pulumi:"assignMembershipOnLogin"`
	// The ID of the connection to enable for the organization.
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// The name of the enabled connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the organization to enable the connection for.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// The strategy of the enabled connection.
	Strategy pulumi.StringOutput `pulumi:"strategy"`
}

// NewOrganizationConnection registers a new resource with the given unique name, arguments, and options.
func NewOrganizationConnection(ctx *pulumi.Context,
	name string, args *OrganizationConnectionArgs, opts ...pulumi.ResourceOption) (*OrganizationConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionId'")
	}
	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	var resource OrganizationConnection
	err := ctx.RegisterResource("auth0:index/organizationConnection:OrganizationConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationConnection gets an existing OrganizationConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationConnectionState, opts ...pulumi.ResourceOption) (*OrganizationConnection, error) {
	var resource OrganizationConnection
	err := ctx.ReadResource("auth0:index/organizationConnection:OrganizationConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationConnection resources.
type organizationConnectionState struct {
	// When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
	AssignMembershipOnLogin *bool `pulumi:"assignMembershipOnLogin"`
	// The ID of the connection to enable for the organization.
	ConnectionId *string `pulumi:"connectionId"`
	// The name of the enabled connection.
	Name *string `pulumi:"name"`
	// The ID of the organization to enable the connection for.
	OrganizationId *string `pulumi:"organizationId"`
	// The strategy of the enabled connection.
	Strategy *string `pulumi:"strategy"`
}

type OrganizationConnectionState struct {
	// When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
	AssignMembershipOnLogin pulumi.BoolPtrInput
	// The ID of the connection to enable for the organization.
	ConnectionId pulumi.StringPtrInput
	// The name of the enabled connection.
	Name pulumi.StringPtrInput
	// The ID of the organization to enable the connection for.
	OrganizationId pulumi.StringPtrInput
	// The strategy of the enabled connection.
	Strategy pulumi.StringPtrInput
}

func (OrganizationConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationConnectionState)(nil)).Elem()
}

type organizationConnectionArgs struct {
	// When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
	AssignMembershipOnLogin *bool `pulumi:"assignMembershipOnLogin"`
	// The ID of the connection to enable for the organization.
	ConnectionId string `pulumi:"connectionId"`
	// The ID of the organization to enable the connection for.
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a OrganizationConnection resource.
type OrganizationConnectionArgs struct {
	// When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
	AssignMembershipOnLogin pulumi.BoolPtrInput
	// The ID of the connection to enable for the organization.
	ConnectionId pulumi.StringInput
	// The ID of the organization to enable the connection for.
	OrganizationId pulumi.StringInput
}

func (OrganizationConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationConnectionArgs)(nil)).Elem()
}

type OrganizationConnectionInput interface {
	pulumi.Input

	ToOrganizationConnectionOutput() OrganizationConnectionOutput
	ToOrganizationConnectionOutputWithContext(ctx context.Context) OrganizationConnectionOutput
}

func (*OrganizationConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationConnection)(nil)).Elem()
}

func (i *OrganizationConnection) ToOrganizationConnectionOutput() OrganizationConnectionOutput {
	return i.ToOrganizationConnectionOutputWithContext(context.Background())
}

func (i *OrganizationConnection) ToOrganizationConnectionOutputWithContext(ctx context.Context) OrganizationConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationConnectionOutput)
}

// OrganizationConnectionArrayInput is an input type that accepts OrganizationConnectionArray and OrganizationConnectionArrayOutput values.
// You can construct a concrete instance of `OrganizationConnectionArrayInput` via:
//
//	OrganizationConnectionArray{ OrganizationConnectionArgs{...} }
type OrganizationConnectionArrayInput interface {
	pulumi.Input

	ToOrganizationConnectionArrayOutput() OrganizationConnectionArrayOutput
	ToOrganizationConnectionArrayOutputWithContext(context.Context) OrganizationConnectionArrayOutput
}

type OrganizationConnectionArray []OrganizationConnectionInput

func (OrganizationConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationConnection)(nil)).Elem()
}

func (i OrganizationConnectionArray) ToOrganizationConnectionArrayOutput() OrganizationConnectionArrayOutput {
	return i.ToOrganizationConnectionArrayOutputWithContext(context.Background())
}

func (i OrganizationConnectionArray) ToOrganizationConnectionArrayOutputWithContext(ctx context.Context) OrganizationConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationConnectionArrayOutput)
}

// OrganizationConnectionMapInput is an input type that accepts OrganizationConnectionMap and OrganizationConnectionMapOutput values.
// You can construct a concrete instance of `OrganizationConnectionMapInput` via:
//
//	OrganizationConnectionMap{ "key": OrganizationConnectionArgs{...} }
type OrganizationConnectionMapInput interface {
	pulumi.Input

	ToOrganizationConnectionMapOutput() OrganizationConnectionMapOutput
	ToOrganizationConnectionMapOutputWithContext(context.Context) OrganizationConnectionMapOutput
}

type OrganizationConnectionMap map[string]OrganizationConnectionInput

func (OrganizationConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationConnection)(nil)).Elem()
}

func (i OrganizationConnectionMap) ToOrganizationConnectionMapOutput() OrganizationConnectionMapOutput {
	return i.ToOrganizationConnectionMapOutputWithContext(context.Background())
}

func (i OrganizationConnectionMap) ToOrganizationConnectionMapOutputWithContext(ctx context.Context) OrganizationConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationConnectionMapOutput)
}

type OrganizationConnectionOutput struct{ *pulumi.OutputState }

func (OrganizationConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationConnection)(nil)).Elem()
}

func (o OrganizationConnectionOutput) ToOrganizationConnectionOutput() OrganizationConnectionOutput {
	return o
}

func (o OrganizationConnectionOutput) ToOrganizationConnectionOutputWithContext(ctx context.Context) OrganizationConnectionOutput {
	return o
}

// When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
func (o OrganizationConnectionOutput) AssignMembershipOnLogin() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OrganizationConnection) pulumi.BoolPtrOutput { return v.AssignMembershipOnLogin }).(pulumi.BoolPtrOutput)
}

// The ID of the connection to enable for the organization.
func (o OrganizationConnectionOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationConnection) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// The name of the enabled connection.
func (o OrganizationConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the organization to enable the connection for.
func (o OrganizationConnectionOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationConnection) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// The strategy of the enabled connection.
func (o OrganizationConnectionOutput) Strategy() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationConnection) pulumi.StringOutput { return v.Strategy }).(pulumi.StringOutput)
}

type OrganizationConnectionArrayOutput struct{ *pulumi.OutputState }

func (OrganizationConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationConnection)(nil)).Elem()
}

func (o OrganizationConnectionArrayOutput) ToOrganizationConnectionArrayOutput() OrganizationConnectionArrayOutput {
	return o
}

func (o OrganizationConnectionArrayOutput) ToOrganizationConnectionArrayOutputWithContext(ctx context.Context) OrganizationConnectionArrayOutput {
	return o
}

func (o OrganizationConnectionArrayOutput) Index(i pulumi.IntInput) OrganizationConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationConnection {
		return vs[0].([]*OrganizationConnection)[vs[1].(int)]
	}).(OrganizationConnectionOutput)
}

type OrganizationConnectionMapOutput struct{ *pulumi.OutputState }

func (OrganizationConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationConnection)(nil)).Elem()
}

func (o OrganizationConnectionMapOutput) ToOrganizationConnectionMapOutput() OrganizationConnectionMapOutput {
	return o
}

func (o OrganizationConnectionMapOutput) ToOrganizationConnectionMapOutputWithContext(ctx context.Context) OrganizationConnectionMapOutput {
	return o
}

func (o OrganizationConnectionMapOutput) MapIndex(k pulumi.StringInput) OrganizationConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationConnection {
		return vs[0].(map[string]*OrganizationConnection)[vs[1].(string)]
	}).(OrganizationConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationConnectionInput)(nil)).Elem(), &OrganizationConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationConnectionArrayInput)(nil)).Elem(), OrganizationConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationConnectionMapInput)(nil)).Elem(), OrganizationConnectionMap{})
	pulumi.RegisterOutputType(OrganizationConnectionOutput{})
	pulumi.RegisterOutputType(OrganizationConnectionArrayOutput{})
	pulumi.RegisterOutputType(OrganizationConnectionMapOutput{})
}
